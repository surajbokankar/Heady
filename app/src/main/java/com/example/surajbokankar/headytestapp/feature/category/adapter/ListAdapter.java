package com.example.surajbokankar.headytestapp.feature.category.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.surajbokankar.headytestapp.R;
import com.example.surajbokankar.headytestapp.constant.Constant;
import com.example.surajbokankar.headytestapp.feature.category.pojo.Product;
import com.example.surajbokankar.headytestapp.feature.details.CategoryDetailActivity;
import com.example.surajbokankar.headytestapp.util.CommonUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.pavlospt.CircleView;

import java.util.ArrayList;

/**
 * Created by suraj.bokankar on 29/12/17.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.CustomHolder> {

    ArrayList<Product> productList=null;
    Context context=null;
    private static final String TAG = "ListAdapter";
    public ListAdapter(ArrayList<Product> products){
        this.productList=products;
    }


    @Override
    public CustomHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.layout_list_content,parent,false);
        context=parent.getContext();
        CustomHolder customHolder=new CustomHolder(view);
        return customHolder;
    }

    @Override
    public void onBindViewHolder(CustomHolder holder, int position) {
      if(productList!=null&&productList.size()>0){
          final Product product=productList.get(position);

          setProfileBackground(holder.circleView,product.name);

          holder.title.setText(product.name);
          String date=product.dateAdded;
          String[] values=date.split("T");
          //Log.i(TAG, "onBindViewHolder: Values="+System.currentTimeMillis());
          /*long dateStamp=CommonUtil.getInstance().getDate(values[0]);
          String format="MMM dd, YYYY";
          String value=CommonUtil.getInstance().getFormatedDate(dateStamp,format);*/
          holder.dateView.setText(values[0]);


          holder.parentView.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  Intent intent=new Intent(context,CategoryDetailActivity.class);
                  try {
                      String details=CommonUtil.getInstance().getMapper().writeValueAsString(product);
                      intent.putExtra(Constant.DETAIL_VIEW.DETAIL,details);
                      context.startActivity(intent);
                  } catch (Exception e) {
                      e.printStackTrace();
                  }

              }
          });


      }
    }



    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class CustomHolder extends RecyclerView.ViewHolder {
        CircleView circleView;
        AppCompatTextView title,dateView;
        RelativeLayout parentView;
        public CustomHolder(View itemView) {
            super(itemView);
            circleView=itemView.findViewById(R.id.circle_image_view);
            title=itemView.findViewById(R.id.product_title_view);
            dateView=itemView.findViewById(R.id.product_date_view);
            parentView=itemView.findViewById(R.id.product_content_parent);
        }
    }

    private void setProfileBackground(CircleView profileImage,String name) {
        name= CommonUtil.getInstance().getUserName(name);
        profileImage.setTitleText(name);
        profileImage.setTitleColor(context.getResources().getColor(R.color.color_app_profile));
        profileImage.setFillColor(context.getResources().getColor(R.color.color_FFFFFF));
        profileImage.setSubtitleText("");
        profileImage.setStrokeColor(context.getResources().getColor(R.color.color_aaaaaa));


        /*GradientDrawable drawable = (GradientDrawable)profileImage.getBackground();
        drawable.setColor(CustomKOLProfile.getInstance().kolProfileBackgroundColor(mContext,name));*/
    }
}
