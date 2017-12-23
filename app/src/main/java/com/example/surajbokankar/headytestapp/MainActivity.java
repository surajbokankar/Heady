package com.example.surajbokankar.headytestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.surajbokankar.headytestapp.feature.CategoryViewModel;
import com.example.surajbokankar.headytestapp.feature.category.OnCategoryAPISuccess;
import com.example.surajbokankar.headytestapp.feature.category.pojo.ParentResponse;
import com.example.surajbokankar.headytestapp.util.CommonUtil;

public class MainActivity extends AppCompatActivity implements OnCategoryAPISuccess {

    CategoryViewModel viewModel=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUI();
    }

    private void setUI() {
        viewModel=CategoryViewModel.getCategoryViewModel();
        viewModel.getCategoryApi(MainActivity.this,this);
    }

    @Override
    public void onCategoryAPiSuccess(ParentResponse parentResponse) {

    }

    @Override
    public void onError(String error) {
        CommonUtil.getInstance().showToast(MainActivity.this,error);
    }
}
