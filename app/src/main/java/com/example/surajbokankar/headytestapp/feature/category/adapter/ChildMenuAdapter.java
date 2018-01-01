package com.example.surajbokankar.headytestapp.feature.category.adapter;

import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.surajbokankar.headytestapp.R;
import com.example.surajbokankar.headytestapp.feature.category.model.ChildCategoryModel;

import java.util.ArrayList;

/**
 * Created by suraj.bokankar on 25/12/17.
 */

public class ChildMenuAdapter extends RecyclerView.Adapter<ChildMenuAdapter.CustomHolder> {

    public ArrayList<ChildCategoryModel> modelList=null;
    public ChildMenuAdapter(ArrayList<ChildCategoryModel> childList){
        this.modelList=childList;
    }

    @Override
    public CustomHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.layout_child_item_view,parent,false);
        CustomHolder customHolder=new CustomHolder(view);
        return customHolder;
    }

    @Override
    public void onBindViewHolder(CustomHolder holder, int position) {
       if(modelList!=null&&modelList.size()>0){
           ChildCategoryModel childCategoryModel=modelList.get(position);
           holder.childItem.setText(childCategoryModel.childCategoryName);
       }
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class CustomHolder extends RecyclerView.ViewHolder {
        AppCompatTextView childItem;
        public CustomHolder(View itemView) {
            super(itemView);
            childItem=itemView.findViewById(R.id.child_item_text);
        }
    }
}
