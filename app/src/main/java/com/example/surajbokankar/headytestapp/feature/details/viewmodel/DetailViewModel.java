package com.example.surajbokankar.headytestapp.feature.details.viewmodel;

import android.util.Log;

import com.example.surajbokankar.headytestapp.feature.category.pojo.Category;
import com.example.surajbokankar.headytestapp.feature.category.pojo.Product;
import com.example.surajbokankar.headytestapp.feature.category.pojo.Variant;
import com.example.surajbokankar.headytestapp.feature.details.model.CommonVariant;
import com.example.surajbokankar.headytestapp.feature.details.model.VariantModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by suraj.bokankar on 03/01/18.
 */

public class DetailViewModel {


    static DetailViewModel model=null;
    private static final String TAG = "DetailViewModel";

    public static DetailViewModel getModel(){
        if(model==null){
            model=new DetailViewModel();
        }
        return model;
    }


    public void getVariantList(Product product){
        ArrayList<Integer> sizeList=new ArrayList<>();
        ArrayList<VariantModel> list=new ArrayList<>();
        ArrayList<Variant> variants=new ArrayList<>();
        variants.addAll(product.variants);
        for(Variant variant:variants){
            sizeList.add((Integer) variant.size);

            if(list.size()>0){
                VariantModel model=new VariantModel();
                model.id=variant.id;
                model.size= (Integer) variant.size;
                Integer index=getObjectIndex(list,model);
                if(index>=0){
                    VariantModel modelVar=list.get(index);
                    CommonVariant commonVariant=new CommonVariant();
                    commonVariant.color=variant.color;
                    commonVariant.prize=variant.price;
                    commonVariant.color=variant.color;
                    modelVar.commonVariants.add(commonVariant);
                }
            }else{
                VariantModel model=new VariantModel();
                model.id=variant.id;
                model.size= (Integer) variant.size;

                CommonVariant commonVariant=new CommonVariant();
                commonVariant.color=variant.color;
                commonVariant.prize=variant.price;
                commonVariant.color=variant.color;
                model.commonVariants.add(commonVariant);
                list.add(model);
            }
        }

        Log.i(TAG, "getVariantList: List="+list.size());

    }



    public Integer getObjectIndex(ArrayList<VariantModel> list, VariantModel category){
        Integer index=-1;

        for(int i=0;i<list.size();i++){
            VariantModel model=list.get(i);

            if(model.size==category.size){
                index=i;
                return index;
            }
        }
        return index;
    }
}
