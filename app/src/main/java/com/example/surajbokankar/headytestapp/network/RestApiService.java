package com.example.surajbokankar.headytestapp.network;




import com.example.surajbokankar.headytestapp.feature.category.pojo.ParentResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by suraj.bokankar on 9/3/17.
 */

public interface RestApiService {

    @GET("json")
    public Call<ParentResponse> getCategoryResponse();


}
