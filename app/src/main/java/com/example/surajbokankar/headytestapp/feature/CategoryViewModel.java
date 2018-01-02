package com.example.surajbokankar.headytestapp.feature;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.Log;

import com.example.surajbokankar.headytestapp.R;
import com.example.surajbokankar.headytestapp.constant.Constant;
import com.example.surajbokankar.headytestapp.feature.category.OnCategoryAPISuccess;
import com.example.surajbokankar.headytestapp.feature.category.model.ChildCategoryModel;
import com.example.surajbokankar.headytestapp.feature.category.model.MainMenuModel;
import com.example.surajbokankar.headytestapp.feature.category.model.MenuModel;
import com.example.surajbokankar.headytestapp.feature.category.model.RankingListModel;
import com.example.surajbokankar.headytestapp.feature.category.pojo.Category;
import com.example.surajbokankar.headytestapp.feature.category.pojo.ParentResponse;
import com.example.surajbokankar.headytestapp.feature.category.pojo.Product;
import com.example.surajbokankar.headytestapp.feature.category.pojo.Ranking;
import com.example.surajbokankar.headytestapp.feature.category.pojo.RankingProducts;
import com.example.surajbokankar.headytestapp.network.NetworkManager;
import com.example.surajbokankar.headytestapp.network.RetrofitRequestBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Optional;
import com.google.common.collect.FluentIterable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by suraj.bokankar on 21/12/17.
 */

public class CategoryViewModel {

    static CategoryViewModel categoryViewModel=null;
    private static final String TAG = "CategoryViewModel";

    public static CategoryViewModel getCategoryViewModel(){
        if(categoryViewModel==null){
            categoryViewModel=new CategoryViewModel();
        }
        return categoryViewModel;
    }


    public void getCategoryApi(final Context context, final OnCategoryAPISuccess listener){
        if(NetworkManager.getInstance().isConnectingToInternet(context)){




            RetrofitRequestBuilder.getInstance(context).callCategoryApi(new Callback<ParentResponse>() {
                @Override
                public void onResponse(Call<ParentResponse> call, Response<ParentResponse> response) {
                    if(response.code()==Constant.RESPONSE_OK){
                        ParentResponse parentResponse=response.body();
                        if(parentResponse!=null){
                            MenuModel menuModel=createMenuResponse(parentResponse);
                            listener.onCategoryAPiSuccess(menuModel);
                        }
                    }else{
                        listener.onError(context.getResources().getString(R.string.null_response));
                    }
                }

                @Override
                public void onFailure(Call<ParentResponse> call, Throwable t) {
                  listener.onError(t.getMessage());
                }
            });

        }else{
            listener.onError(context.getResources().getString(R.string.network_error));
        }
    }

    private MenuModel createMenuResponse(ParentResponse parentResponse) {
        MenuModel mainModel=new MenuModel();
        ArrayList<MainMenuModel> menuList=new ArrayList<>();
        try{
            ArrayList<Category> categories=parentResponse.categories;
            if(categories!=null&&categories.size()>0){
                for(Category category:categories) {
                    MainMenuModel menuModel=new MainMenuModel();
                    menuModel.categoryTitle=category.name;
                    menuModel.id=category.id;
                    menuModel.productList=category.products;

                    ArrayList<ChildCategoryModel> childModel=new ArrayList<>();
                    if(category.childCategories!=null&&category.childCategories.size()>0){
                        for(int i=0;i<category.childCategories.size();i++){
                            ChildCategoryModel childCategoryModel=new ChildCategoryModel();
                            Category childCate=new Category();
                            childCate.id=category.childCategories.get(i);
                            if(getChileObjectIndex(categories,childCate)>-1){
                                int index=getChileObjectIndex(categories,childCate);

                                Log.i(TAG, "createMenuResponse: Category="+index);
                                Category childCategory=categories.get(index);
                                childCategoryModel.childCategoryId=childCategory.id;
                                childCategoryModel.childCategoryName=childCategory.name;
                                childCategoryModel.childProducts=childCategory.products;
                                childModel.add(childCategoryModel);
                            }else{
                                Product item=new Product();
                                item.id=childCate.id;
                                Product product=getProductIndex(category.products,item);
                                childCategoryModel.childCategoryId=product.id;
                                childCategoryModel.childCategoryName=product.name;
                                childCategoryModel.childProducts.add(product);
                                childModel.add(childCategoryModel);
                            }
                        }
                    }
                    menuModel.childCategoryModels=childModel;
                    menuList.add(menuModel);
                }
            }
        }catch (Exception e){
            Log.i(TAG, "createMenuResponse: Error="+e.getMessage());
        }
         mainModel.menuModels=menuList;
         mainModel.rankingListModels=getRankingModeList(menuList,parentResponse);
          printMenuList(mainModel);
         // Log.i(TAG, "createMenuResponse: Response="+"\n"+mainModel.menuModels.size()+"\t"+mainModel.rankingListModels.size());

        return mainModel;

    }

    private void printMenuList(MenuModel mainModel) {
        for(MainMenuModel model:mainModel.menuModels){
           // Log.i(TAG, "printMenuList: Values="+model.id+"\t"+model.categoryTitle+"\n"+model.productList.size());
            if(model.childCategoryModels!=null){
               // Log.i(TAG, "printMenuList: Child List="+model.childCategoryModels.size());
            }
        }
        if(mainModel.rankingListModels!=null&&mainModel.rankingListModels.size()>0){
           // Log.i(TAG, "printMenuList: Ranking List="+mainModel.rankingListModels.size());
        }

    }

    private ArrayList<RankingListModel> getRankingModeList(ArrayList<MainMenuModel> menuList,ParentResponse parentResponse) {
    ArrayList<RankingListModel> listModels=new ArrayList<>();
    ArrayList<Ranking> list=parentResponse.rankings;
    if(list!=null&&list.size()>0){
        for(Ranking ranking:list){
            RankingListModel model=new RankingListModel();
            model.rankingName=ranking.ranking;
            model.rankingProductList=new ArrayList<>();
            for(RankingProducts products:ranking.products){
                Category category=new Category();
                category.id=products.id;
                int index=getResultUsingBinarySearch(parentResponse.categories,category);
                if(index>0){
                    MainMenuModel menuItem=menuList.get(index);
                    MainMenuModel mainMenuModel=new MainMenuModel();
                    mainMenuModel.id=menuItem.id;
                    mainMenuModel.categoryTitle=menuItem.categoryTitle;
                    setRankingProductList(menuItem.productList,mainMenuModel);
                    model.rankingProductList.add(mainMenuModel);
                }else{
                    getProductForRanking(menuList,products.id,model);
                }


            }
            listModels.add(model);
        }
    }



    return listModels;

    }

    private boolean getProductForRanking(ArrayList<MainMenuModel> menuList, Integer id,RankingListModel rankingListModel) {
         boolean isAdded=false;
        for(MainMenuModel model:menuList){

             if(model.productList!=null&&model.productList.size()>0){
                    for(Product product:model.productList){
                        if(product.id==id){
                            Log.i(TAG, "getProductForRanking: Id="+id);
                            MainMenuModel mainMenuModel=new MainMenuModel();
                            mainMenuModel.id=product.id;
                            mainMenuModel.categoryTitle=product.name;
                            //setRankingProductList(model.productList,mainMenuModel);
                            mainMenuModel.productList.add(product);
                            rankingListModel.rankingProductList.add(mainMenuModel);
                            return isAdded;
                        }
                    }

            }
        }

      return  isAdded;
    }

    private void setRankingProductList(ArrayList<Product> productList, MainMenuModel model) {
        for(Product product:productList){
            model.productList.add(product);
        }
        //Log.i(TAG, "setRankingProductList: Predicate="+nameEqualsTo(1));
    }

    Predicate<Product> nameEqualsTo(final int id) {
        return new Predicate<Product>() {

            @Override
            public boolean test(Product category) {
                return false;
            }

            public boolean apply(Product dataPoint) {
                return (dataPoint.id==id);
            }

        };
    }

   public Integer getChileObjectIndex(ArrayList<Category> list,Category category){
        Integer index=-1;

        for(int i=0;i<list.size();i++){
            Category model=list.get(i);
            Log.i(TAG, "getChileObjectIndex: Values="+model.id+"\t"+category.id);
            if(model.id==category.id){
                index=i;
                return index;
            }
        }
       return index;
   }



   public int getResultUsingBinarySearch(ArrayList<Category> list,Category cat){
       Comparator<Category> c = new Comparator<Category>()
       {
           public int compare(Category u1, Category u2)
           {
               return u1.id.compareTo(u2.id);
           }
       };

       int index = Collections.binarySearch(list,
               cat, c);
       return index;
   }


   public Product getProductIndex(ArrayList<Product> productList,Product product){
       Comparator<Product> productComparator = new Comparator<Product>()
       {
           public int compare(Product u1, Product u2)
           {
               return u1.id.compareTo(u2.id);
           }
       };

       int index = Collections.binarySearch(productList,
               product, productComparator);

       return productList.get(index);
   }


   public MainMenuModel getProductModel(ArrayList<MainMenuModel> models){
       MainMenuModel mainMenuModel=new MainMenuModel();
       ArrayList<Product> list=new ArrayList<>();
       for(MainMenuModel item:models){
           list.addAll(item.productList);
       }
       mainMenuModel.productList=list;
       return mainMenuModel;
   }


}
