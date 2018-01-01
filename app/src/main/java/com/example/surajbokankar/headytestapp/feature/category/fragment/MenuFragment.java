package com.example.surajbokankar.headytestapp.feature.category.fragment;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.surajbokankar.headytestapp.R;
import com.example.surajbokankar.headytestapp.constant.Constant;
import com.example.surajbokankar.headytestapp.databinding.LayoutListItemViewBinding;
import com.example.surajbokankar.headytestapp.feature.CategoryViewModel;
import com.example.surajbokankar.headytestapp.feature.category.MenuClickListener;
import com.example.surajbokankar.headytestapp.feature.category.adapter.MenuListAdapter;
import com.example.surajbokankar.headytestapp.feature.category.model.MainMenuModel;
import com.example.surajbokankar.headytestapp.feature.category.model.MenuModel;
import com.example.surajbokankar.headytestapp.util.CommonUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

/**
 * Created by suraj.bokankar on 30/12/17.
 */

public class MenuFragment extends Fragment  {

    private static final String TAG = "MenuFragment";
    LayoutListItemViewBinding menuBinding=null;
    LinearLayoutManager linearLayoutManager=null;
    CategoryViewModel viewModel=null;
    Context context=null;
    ArrayList<MainMenuModel> modelArrayList=null;
    MenuListAdapter menuAdapter=null;
    MenuModel model=null;
    MenuClickListener callBack=null;

    static  MenuFragment menuFragment=null;

    public static MenuFragment getMenuFragment(String menuModel,MenuClickListener listener){
        menuFragment=new MenuFragment();
        menuFragment.initialize(menuModel,menuFragment,listener);
        return menuFragment;
    }

    private void initialize(String menuModel,Fragment fragment,MenuClickListener listener) {
     this.callBack=listener;
     Bundle bundle=new Bundle();
     bundle.putString(Constant.MENU_RESPONSE,menuModel);
     fragment.setArguments(bundle);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        menuBinding= DataBindingUtil.inflate(inflater, R.layout.layout_list_item_view,container,false);
        View view=menuBinding.getRoot();
        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setDefaultMenuView();
    }





    private void setDefaultMenuView() {

        if(getArguments()!=null){
            try{
                String response=getArguments().getString(Constant.MENU_RESPONSE);
                ObjectMapper objectMapper=new ObjectMapper();
                Log.i(TAG, "setDefaultMenuView: Values="+response);
                model=null;
                model=objectMapper.readValue(response,MenuModel.class);
                modelArrayList=model.menuModels;
            }catch (Exception e){
                Log.i(TAG, "intiView: Error="+e.getMessage());
            }
        }
        linearLayoutManager= CommonUtil.getInstance().getVerticalLayoutManager(context);

        MenuListAdapter menuAdapter=new MenuListAdapter(modelArrayList,callBack);
        menuBinding.listRecyclerView.setLayoutManager(linearLayoutManager);
        menuBinding.listRecyclerView.setAdapter(menuAdapter);

    }


}
