package com.example.surajbokankar.headytestapp.feature.category.model;

import com.example.surajbokankar.headytestapp.feature.category.pojo.Product;

import java.util.ArrayList;

/**
 * Created by suraj.bokankar on 21/12/17.
 */

public class MainMenuModel {
    public int id;
    public String categoryTitle=null;
    public ArrayList<Product> productList=null;
    public ArrayList<ChildCategoryModel> childCategoryModels=null;


}
