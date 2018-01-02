package com.example.surajbokankar.headytestapp.feature.category.adapter;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.surajbokankar.headytestapp.R;
import com.example.surajbokankar.headytestapp.feature.category.MenuClickListener;
import com.example.surajbokankar.headytestapp.feature.category.model.MainMenuModel;
import com.example.surajbokankar.headytestapp.util.CommonUtil;

import java.util.ArrayList;

/**
 * Created by suraj.bokankar on 21/12/17.
 */

public class MenuListAdapter extends RecyclerView.Adapter<MenuListAdapter.CustomHolder> {

    ArrayList<MainMenuModel> modelList=null;
    Context context=null;
    int count=0;
    ChildMenuAdapter childCategoryAdapter=null;
    MenuClickListener callBack=null;
    public MenuListAdapter(ArrayList<MainMenuModel> menuModels, MenuClickListener listener){
        this.modelList=menuModels;
        this.callBack=listener;
    }

    @Override
    public CustomHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.layout_content_item,parent,false);
        CustomHolder customHolder=new CustomHolder(view);
        context=parent.getContext();
        return customHolder;
    }

    @Override
    public void onBindViewHolder(final CustomHolder holder, final int position) {
     if(modelList!=null&&modelList.size()>0){
         final MainMenuModel mainMenuModel=modelList.get(position);
         holder.itemTitle.setText(mainMenuModel.categoryTitle);
         if(mainMenuModel.childCategoryModels!=null&&mainMenuModel.childCategoryModels.size()>0){
             holder.dropDown.setVisibility(View.VISIBLE);
              childCategoryAdapter=new ChildMenuAdapter(mainMenuModel.childCategoryModels,callBack);
             holder.childViewRecycler.setLayoutManager(CommonUtil.getInstance().getVerticalLayoutManager(context));

         }else{
             holder.dropDown.setVisibility(View.GONE);
         }


         holder.itemTitle.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(mainMenuModel.productList!=null&&mainMenuModel.productList.size()>0)
                 callBack.onMenuClick(mainMenuModel);
             }
         });

         holder.dropDown.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
               int count=0;
                 if(count==0){
                     count++;
                     holder.childViewRecycler.setVisibility(View.VISIBLE);
                     holder.dropDown.setVisibility(View.VISIBLE);
                     childCategoryAdapter=new ChildMenuAdapter(mainMenuModel.childCategoryModels,callBack);
                     holder.childViewRecycler.setLayoutManager(CommonUtil.getInstance().getVerticalLayoutManager(context));
                     holder.childViewRecycler.setAdapter(childCategoryAdapter);

                 }else{
                     count--;
                     holder.childViewRecycler.setVisibility(View.GONE);
                 }

             }
         });

     }
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class CustomHolder extends RecyclerView.ViewHolder {
        AppCompatTextView itemTitle;
        AppCompatImageView dropDown;
        RecyclerView childViewRecycler;
        public CustomHolder(View itemView) {
            super(itemView);
            itemTitle=itemView.findViewById(R.id.item_text);
            dropDown=itemView.findViewById(R.id.child_view_button);
            childViewRecycler=itemView.findViewById(R.id.child_recycler_view);
        }
    }
}
