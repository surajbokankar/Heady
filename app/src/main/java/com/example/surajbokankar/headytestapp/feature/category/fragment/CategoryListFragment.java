package com.example.surajbokankar.headytestapp.feature.category.fragment;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.surajbokankar.headytestapp.R;
import com.example.surajbokankar.headytestapp.constant.Constant;
import com.example.surajbokankar.headytestapp.databinding.LayoutListItemViewBinding;
import com.example.surajbokankar.headytestapp.feature.category.adapter.ListAdapter;
import com.example.surajbokankar.headytestapp.feature.category.model.MainMenuModel;
import com.example.surajbokankar.headytestapp.feature.category.model.MenuModel;
import com.example.surajbokankar.headytestapp.feature.category.pojo.Product;
import com.example.surajbokankar.headytestapp.util.CommonUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

/**
 * Created by suraj.bokankar on 29/12/17.
 */

public class CategoryListFragment extends Fragment {

    private static final String TAG = "CategoryListFragment";
    LayoutListItemViewBinding listBinding=null;
    private static CategoryListFragment fragment=null;
    MainMenuModel model=null;

    public static CategoryListFragment getFragment(String response){
        fragment=new CategoryListFragment();
        fragment.initalizeView(response,fragment);
        return fragment;
    }

    private void initalizeView(String response,CategoryListFragment fragment) {
          Bundle bundle=new Bundle();
          bundle.putString(Constant.MENU_RESPONSE,response);
          fragment.setArguments(bundle);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        listBinding= DataBindingUtil.inflate(inflater, R.layout.layout_list_item_view,container,false);
        View view=listBinding.getRoot();
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        intiView();
    }

    private void intiView() {

         if(getArguments()!=null){
             try{
                String response=getArguments().getString(Constant.MENU_RESPONSE);
                 ObjectMapper objectMapper=new ObjectMapper();
                 model=null;
                 model=objectMapper.readValue(response,MainMenuModel.class);
             }catch (Exception e){
                 Log.i(TAG, "intiView: Error="+e.getMessage());
             }
         }



         listBinding.listRecyclerView.setLayoutManager(CommonUtil.getInstance().getGridLayoutManager(getContext()));
         ListAdapter listAdapter=new ListAdapter(model.productList);
         listBinding.listRecyclerView.setAdapter(listAdapter);
    }
}
