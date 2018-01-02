package com.example.surajbokankar.headytestapp.feature.details;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.surajbokankar.headytestapp.R;
import com.example.surajbokankar.headytestapp.constant.Constant;
import com.example.surajbokankar.headytestapp.databinding.LayoutDetailActivityBinding;
import com.example.surajbokankar.headytestapp.feature.category.pojo.Product;
import com.example.surajbokankar.headytestapp.util.CommonUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by suraj.bokankar on 31/12/17.
 */

public class CategoryDetailActivity extends AppCompatActivity {

    LayoutDetailActivityBinding detailActivityBinding=null;

    static CategoryDetailActivity detailActivity=null;
    Product product=null;


    public static  CategoryDetailActivity getInstance(Product product){
        if(detailActivity==null){
            detailActivity=new CategoryDetailActivity();
        }
        return detailActivity;
    }




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        detailActivityBinding= DataBindingUtil.setContentView(this, R.layout.layout_detail_activity);
        initView();
    }

    private void initView() {

        if(getIntent()!=null&&getIntent().hasExtra(Constant.DETAIL_VIEW.DETAIL)){
            try{
                ObjectMapper objectMapper=CommonUtil.getInstance().getMapper();
                product=objectMapper.readValue(getIntent().getStringExtra(Constant.DETAIL_VIEW.DETAIL),Product.class);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        CommonUtil.getInstance().setProfileBackground(CategoryDetailActivity.this,detailActivityBinding.imageProductView,product.name);
        detailActivityBinding.titleProductText.setText(product.name);
        detailActivityBinding.subTitle.setText(product.dateAdded);

    }




}
