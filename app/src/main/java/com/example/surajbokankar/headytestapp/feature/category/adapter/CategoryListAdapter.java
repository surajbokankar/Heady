package com.example.surajbokankar.headytestapp.feature.category.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by suraj.bokankar on 21/12/17.
 */

public class CategoryListAdapter extends RecyclerView.Adapter<CategoryListAdapter.CustomHolder> {


    @Override
    public CustomHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(CustomHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CustomHolder extends RecyclerView.ViewHolder {
        public CustomHolder(View itemView) {
            super(itemView);
        }
    }
}
