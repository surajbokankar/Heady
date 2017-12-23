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
                            createMenuResponse(parentResponse);
                            listener.onCategoryAPiSuccess(parentResponse);
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
                            if(getChileObjectIndex(categories,category)>-1){
                                int index=getChileObjectIndex(categories,category);
                                Log.i(TAG, "createMenuResponse: Category="+index);
                                Category childCategory=categories.get(index);
                                childCategoryModel.childCategoryId=childCategory.id;
                                childCategoryModel.childCategoryName=childCategory.name;
                                childCategoryModel.childProducts=childCategory.products;
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
          Log.i(TAG, "createMenuResponse: Response="+"\n"+mainModel.menuModels.size()+"\t"+mainModel.rankingListModels.size());

        return mainModel;

    }

    private void printMenuList(MenuModel mainModel) {
        for(MainMenuModel model:mainModel.menuModels){
            Log.i(TAG, "printMenuList: Values="+model.id+"\t"+model.categoryTitle+"\n"+model.productList.size());
            if(model.childCategoryModels!=null){
                Log.i(TAG, "printMenuList: Child List="+model.childCategoryModels.size());
            }
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
                getProductForRanking(menuList,products.id,model);

            }
            listModels.add(model);
        }
    }



    return listModels;

    }

    private void getProductForRanking(ArrayList<MainMenuModel> menuList, Integer id,RankingListModel rankingListModel) {

        for(MainMenuModel model:menuList){
            if(model.id==id){
                MainMenuModel mainMenuModel=new MainMenuModel();
                mainMenuModel.id=model.id;
                mainMenuModel.categoryTitle=model.categoryTitle;
                setRankingProductList(model.productList,mainMenuModel);
                rankingListModel.rankingProductList.add(mainMenuModel);
            }else  if(model.productList!=null&&model.productList.size()>0){
                    for(Product product:model.productList){
                        if(product.id==id){
                            MainMenuModel mainMenuModel=new MainMenuModel();
                            mainMenuModel.id=model.id;
                            mainMenuModel.categoryTitle=model.categoryTitle;
                            setRankingProductList(model.productList,mainMenuModel);
                            rankingListModel.rankingProductList.add(mainMenuModel);
                        }
                    }
            }
        }


    }

    private void setRankingProductList(ArrayList<Product> productList, MainMenuModel model) {
        for(Product product:productList){
            model.productList.add(product);
        }
        Log.i(TAG, "setRankingProductList: Predicate="+nameEqualsTo(1));
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


    /*Category findCarnet(ArrayList<Category> list,int codeIsIn) {
        Predicate<Category> predicate = c-> c.id==codeIsIn;
        Category  obj = list.stream().filter(predicate).findFirst().get();
        return obj;
    }*/

   public Integer getChileObjectIndex(ArrayList<Category> list,Category category){
        Integer index=-1;

        /*index=Collections.binarySearch(list,category, new Comparator<Category>() {
           @Override
           public int compare(Category o1, Category o2) {
               Log.i(TAG, "getChileObjectIndex: Value="+o1.id+"\t"+o2.id);
               return o1.id.compareTo(o2.id);
           }
       });*/
      // List<Category> olderUsers = list.stream().filter(u -> u.age > 30).collect(Collectors.toList());




        for(int i=0;i<list.size();i++){
            Category model=list.get(i);
            if(model.id==category.id){
                index=i;
                return index;
            }
        }


        return index;
   }



}
