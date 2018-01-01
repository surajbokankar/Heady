package com.example.surajbokankar.headytestapp;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.BottomSheetDialog;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

import com.example.surajbokankar.headytestapp.constant.Constant;
import com.example.surajbokankar.headytestapp.databinding.ActivityMainBinding;
import com.example.surajbokankar.headytestapp.feature.CategoryViewModel;
import com.example.surajbokankar.headytestapp.feature.category.MenuClickListener;
import com.example.surajbokankar.headytestapp.feature.category.OnCategoryAPISuccess;
import com.example.surajbokankar.headytestapp.feature.category.fragment.CategoryListFragment;
import com.example.surajbokankar.headytestapp.feature.category.fragment.MenuFragment;
import com.example.surajbokankar.headytestapp.feature.category.model.MainMenuModel;
import com.example.surajbokankar.headytestapp.feature.category.model.MenuModel;
import com.example.surajbokankar.headytestapp.feature.category.pojo.ParentResponse;
import com.example.surajbokankar.headytestapp.util.CommonUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnCategoryAPISuccess,MenuClickListener {

    CategoryViewModel viewModel=null;
    ActivityMainBinding mainBinding=null;
    private static final String TAG = "MainActivity";
    Context context=null;
    MenuModel menuModel=null;
    MainMenuModel listModel=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        setUI();
    }

    private void setUI() {
        context=MainActivity.this;
        viewModel=CategoryViewModel.getCategoryViewModel();
        viewModel.getCategoryApi(context,this);
        setClickListners();


    }

    private void setClickListners() {



        mainBinding.menuFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainBinding.menuFab.setVisibility(View.GONE);
                loadMenuFragment();
            }
        });

        mainBinding.bottomNavView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.action_menu:
                        if(listModel!=null)
                        loadListFragment(listModel);
                        return true;
                    case R.id.action_sort:
                        loadSortBottomSheet();
                        return true;
                }
                return false;
            }
        });
    }

    private void loadSortBottomSheet() {
        BottomSheetDialog dialog=CommonUtil.getInstance().getBottomSheet(context,R.layout.layout_bottom_sheet,menuModel.rankingListModels,"Sort",this);
    }

    private String getMenuModel(MenuModel menuModel) {
      String response=null;
        try{

            ObjectMapper objectMapper=new ObjectMapper();
            response=objectMapper.writeValueAsString(menuModel);

      }catch (Exception e){
          Log.i(TAG, "getMenuModel: Error="+e.getMessage());
      }

      return response;
    }

    private void changeFragment(Fragment fragment,String tag) {
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=manager.beginTransaction();
        fragmentTransaction.replace(R.id.container,fragment,tag).addToBackStack(tag).commit();
    }

    private void loadMenuFragment() {
        String response=getMenuModel(menuModel);
        MenuFragment menuFragment=MenuFragment.getMenuFragment(response,this);
        changeFragment(menuFragment,Constant.FRAGMENT_NAME.MENU);
    }

    private void callAPI() {
    viewModel.getCategoryApi(context,this);
    }

    @Override
    public void onCategoryAPiSuccess(MenuModel parentResponse) {
        Log.i(TAG, "onCategoryAPiSuccess: Success="+parentResponse);
        menuModel=parentResponse;
        loadListFragment(menuModel.menuModels.get(0));
    }

    @Override
    public void onError(String error) {
        CommonUtil.getInstance().showToast(context,error);
    }

    @Override
    public void onMenuClick(MainMenuModel menuModel) {
        mainBinding.menuFab.setVisibility(View.VISIBLE);
        listModel=menuModel;
        loadListFragment(menuModel);
    }

    private void loadListFragment(MainMenuModel menuModel) {

        String response=getListResponse(menuModel);
        CategoryListFragment categoryListFragment=CategoryListFragment.getFragment(response);
        changeFragment(categoryListFragment,Constant.FRAGMENT_NAME.LIST);
    }

    @Override
    public void onBottomMenuClick(ArrayList<MainMenuModel> menuModel) {

        MainMenuModel model=viewModel.getProductModel(menuModel);
        loadListFragment(model);
    }


    public String getListResponse(MainMenuModel menuModel){
        String response=null;
        try{
            ObjectMapper objectMapper=new ObjectMapper();
            response=objectMapper.writeValueAsString(menuModel);
        }catch (Exception e){
            Log.i(TAG, "getMenuModel: Error="+e.getMessage());
        }
        return response;
    }
}
