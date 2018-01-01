package com.example.surajbokankar.headytestapp.feature.category.adapter;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.surajbokankar.headytestapp.R;
import com.example.surajbokankar.headytestapp.feature.category.MenuClickListener;
import com.example.surajbokankar.headytestapp.feature.category.model.RankingListModel;

import java.util.ArrayList;

/**
 * Created by suraj.bokankar on 30/12/17.
 */

public class SortListAdapter extends RecyclerView.Adapter<SortListAdapter.CustomModel> {

    public ArrayList<RankingListModel> rankingListModels=null;
    Context context=null;
    MenuClickListener listener=null;

    public SortListAdapter(ArrayList<RankingListModel> models,MenuClickListener menuClickListener){
        this.listener=menuClickListener;
        this.rankingListModels=models;
    }


    @Override
    public CustomModel onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.layout_sort_content,parent,false);
        CustomModel customModel=new CustomModel(view);
        return customModel;
    }

    @Override
    public void onBindViewHolder(CustomModel holder, int position) {
        if(rankingListModels!=null&&rankingListModels.size()>0){
            final RankingListModel model=rankingListModels.get(position);
            holder.title.setText(model.rankingName);


            holder.title.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onBottomMenuClick(model.rankingProductList);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return rankingListModels.size();
    }

    public class CustomModel extends RecyclerView.ViewHolder {
        AppCompatTextView title;
        public CustomModel(View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.sort_text);
        }
    }
}
