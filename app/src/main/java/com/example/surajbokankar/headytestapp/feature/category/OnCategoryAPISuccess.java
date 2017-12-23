package com.example.surajbokankar.headytestapp.feature.category;

import com.example.surajbokankar.headytestapp.feature.category.pojo.ParentResponse;

/**
 * Created by suraj.bokankar on 21/12/17.
 */

public interface OnCategoryAPISuccess {

    public  void onCategoryAPiSuccess(ParentResponse parentResponse);

    public void onError(String error);
}
