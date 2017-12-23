package com.example.surajbokankar.headytestapp.util;

import android.content.Context;
import android.content.SharedPreferences;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;


/**
 * Created by suraj.bokankar on 9/3/17.
 */

public class PreferenceManager {
    static PreferenceManager preferenceManager=null;
    SharedPreferences sharedPreferences=null;
    static SharedPreferences.Editor editor=null;
    ObjectMapper objectMapper;
    public PreferenceManager getInstance(Context context){
        if(preferenceManager==null){
            preferenceManager=new PreferenceManager();
        }
        sharedPreferences=context.getSharedPreferences(PreferenceString.preferenceString,Context.MODE_PRIVATE);
        editor=sharedPreferences.edit();
    return  preferenceManager;
    }


    public interface PreferenceString{
        String preferenceString="heady";
        String tokenString="token";
        String EmptyString="";
        String CategoryDetails ="details";
    }
    /*public UserInfo getUserInfo() {
        String userDetails=sharedPreferences.getString(PreferenceString.CategoryDetails, PreferenceString.EmptyString);
        try {
            userInfo=objectMapper.readValue(userDetails,UserInfo.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
        objectMapper=new ObjectMapper();
        try {
            String userInfoString=objectMapper.writeValueAsString(userInfo);
            editor.putString(PreferenceString.CategoryDetails,userInfoString);
            doCommit();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }*/

    private void doCommit() {
        if ( editor != null) {
            editor.commit();
            editor = null;
        }
    }



}
