package com.example.surajbokankar.headytestapp.feature;

import android.content.Context;

import com.example.surajbokankar.headytestapp.R;
import com.example.surajbokankar.headytestapp.constant.Constant;
import com.example.surajbokankar.headytestapp.feature.category.OnCategoryAPISuccess;
import com.example.surajbokankar.headytestapp.feature.category.pojo.ParentResponse;
import com.example.surajbokankar.headytestapp.network.NetworkManager;
import com.example.surajbokankar.headytestapp.network.RetrofitRequestBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by suraj.bokankar on 21/12/17.
 */

public class CategoryViewModel {

    static CategoryViewModel categoryViewModel=null;

    public static CategoryViewModel getCategoryViewModel(){
        if(categoryViewModel==null){
            categoryViewModel=new CategoryViewModel();
        }
        return categoryViewModel;
    }


    public void getCategoryApi(final Context context, final OnCategoryAPISuccess listener){
        if(NetworkManager.getInstance().isConnectingToInternet(context)){

            RetrofitRequestBuilder.getInstance(context).callCategoryApi(new Callback<ParentResponse>() {
                @Override
                public void onResponse(Call<ParentResponse> call, Response<ParentResponse> response) {
                    if(response.code()==Constant.RESPONSE_OK){
                        ParentResponse parentResponse=response.body();
                        if(parentResponse!=null){
                            listener.onCategoryAPiSuccess(parentResponse);
                        }
                    }else{
                        listener.onError(context.getResources().getString(R.string.null_response));
                    }
                }

                @Override
                public void onFailure(Call<ParentResponse> call, Throwable t) {
                  listener.onError(t.getMessage());
                }
            });

        }else{
            listener.onError(context.getResources().getString(R.string.network_error));
        }
    }
}
