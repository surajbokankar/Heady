package com.example.surajbokankar.headytestapp.network;

import android.content.Context;
import android.util.Log;

import com.example.surajbokankar.headytestapp.constant.Constant;
import com.example.surajbokankar.headytestapp.feature.category.pojo.ParentResponse;

import okhttp3.MediaType;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

/**
 * Created by suraj.bokankar on 10/3/17.
 */

public class RetrofitRequestBuilder {

    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private static final String TAG = "RetrofitRequestBuilder";
    static RetrofitRequestBuilder retrofitRequestBuilder=null;
    static  Context mContext=null;


    public static RetrofitRequestBuilder getInstance(Context context){
        if(retrofitRequestBuilder==null){
            retrofitRequestBuilder=new RetrofitRequestBuilder();
            mContext=context;
        }

        return retrofitRequestBuilder;
    }



    public  Call<ParentResponse> callCategoryApi(Callback<ParentResponse> listener) {
        Call<ParentResponse> call = null;

        try {
            Retrofit retrofitBuilder = RetrofitClientBuilder.getInstance().setHTTPClient(mContext).setBaseUrl(Constant.BASE_URL).builder();
            RestApiService apiService = retrofitBuilder.create(RestApiService.class);
            call = apiService.getCategoryResponse();
            call.enqueue(listener);
            Log.i(TAG, "callCategoryApi: Request  Url=" + call.request().headers() + "\n" + call.request().url());
        } catch (Exception e) {
            Log.i(TAG, "callCategoryApi: Error=" + e.getMessage());
        }
        return call;
    }





}
