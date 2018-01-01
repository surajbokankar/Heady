package com.example.surajbokankar.headytestapp.feature.category.adapter;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.surajbokankar.headytestapp.R;
import com.example.surajbokankar.headytestapp.feature.category.pojo.Product;
import com.example.surajbokankar.headytestapp.util.CommonUtil;
import com.github.pavlospt.CircleView;

import java.util.ArrayList;

/**
 * Created by suraj.bokankar on 29/12/17.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.CustomHolder> {

    ArrayList<Product> productList=null;
    Context context=null;
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
          Product product=productList.get(position);

          setProfileBackground(holder.circleView,product.name);

          holder.title.setText(product.name);
          holder.dateView.setText(product.dateAdded);
      }
    }



    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class CustomHolder extends RecyclerView.ViewHolder {
        CircleView circleView;
        AppCompatTextView title,dateView;
        public CustomHolder(View itemView) {
            super(itemView);
            circleView=itemView.findViewById(R.id.circle_image_view);
            title=itemView.findViewById(R.id.product_title_view);
            dateView=itemView.findViewById(R.id.product_date_view);
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
