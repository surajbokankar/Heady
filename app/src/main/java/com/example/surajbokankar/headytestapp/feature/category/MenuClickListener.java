package com.example.surajbokankar.headytestapp.feature.category;

import com.example.surajbokankar.headytestapp.feature.category.model.MainMenuModel;

import java.util.ArrayList;

/**
 * Created by suraj.bokankar on 29/12/17.
 */

public interface MenuClickListener {

    public void  onMenuClick(MainMenuModel menuModel);

    public  void onBottomMenuClick(ArrayList<MainMenuModel> menuModel);



}
