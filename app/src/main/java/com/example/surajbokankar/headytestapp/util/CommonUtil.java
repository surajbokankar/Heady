package com.example.surajbokankar.headytestapp.util;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;

import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.Toast;


import com.example.surajbokankar.headytestapp.R;
import com.example.surajbokankar.headytestapp.feature.category.MenuClickListener;
import com.example.surajbokankar.headytestapp.feature.category.adapter.ChildMenuAdapter;
import com.example.surajbokankar.headytestapp.feature.category.adapter.SortListAdapter;
import com.example.surajbokankar.headytestapp.feature.category.model.RankingListModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pavlospt.CircleView;

import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by suraj.bokankar on 13/10/17.
 */

public class CommonUtil {

    static CommonUtil commonUtil=null;
    private static final String TAG = "CommonUtil";
    int MONTH,YEAR,DAY;
    ProgressDialog myProgressDialog=null;


    public static CommonUtil getInstance(){
        if(commonUtil==null){
            commonUtil=new CommonUtil();
        }
        return commonUtil;
    }

    public static boolean isEmailValid(Context context, String emailId) {
        boolean isValid = false;

        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        CharSequence inputStr = emailId;

        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        if (matcher.matches()) {
            isValid = true;
        }

        return isValid;

    }

    public  static void hideKeyBoard(Context context,View view){
        if (view != null&&context!=null) {
            InputMethodManager imm = (InputMethodManager)context.getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void showSnackBar(Context context, String message, View view) {

        if(context!=null&&view!=null){
            Snackbar snackbar = Snackbar
                    .make(view, message, Snackbar.LENGTH_LONG);
            snackbar.setActionTextColor(Color.RED);
            View snackbarView = snackbar.getView();
            snackbarView.setBackgroundColor(Color.DKGRAY);
            TextView textView = (TextView) snackbarView.findViewById(android.support.design.R.id.snackbar_text);
            textView.setTextColor(Color.WHITE);
            snackbar.show();
        }

    }

    public  void showToast(Context context,String message) {
        if(context!=null)
            Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }

    public  String getUserName(String name) {
        String value="";
        if(!TextUtils.isEmpty(name)){
            String[] listOfName=name.split(" ");
            StringBuilder builder=new StringBuilder();
            if(listOfName.length>=2){
                String charSequence=listOfName[0].substring(0,1);
                String lastChar=(listOfName[listOfName.length-1]).substring(0,1);
                builder=builder.append(charSequence).append(lastChar);
                value=builder.toString();
            }else if(listOfName.length==1){
                String str=listOfName[0];
                String firstChar=listOfName[0].substring(0,1);
                String lastChar=str.substring((str.length())-1,(str.length()));
                builder.append(firstChar).append(lastChar);
                value=builder.toString();
            }
        }
        return value.toUpperCase();
    }


    public LinearLayoutManager getHorizontalLayoutManager(Context context){
        LinearLayoutManager horizontalLayoutManagaer
                = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        return  horizontalLayoutManagaer;
    }


    public  LinearLayoutManager getVerticalLayoutManager(Context context){
        LinearLayoutManager horizontalLayoutManagaer
                = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
        return  horizontalLayoutManagaer;
    }

    public static LinearLayoutManager getGridLayoutManager(Context context){
        GridLayoutManager gridLayoutManager
                = new GridLayoutManager(context, 2, GridLayoutManager.VERTICAL, false);
        /*gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return (position % 3 == 0 ? 2 : 1);
            }
        });*/
        return  gridLayoutManager;
    }

    public void changeStatusBar(Context context,int color,boolean shouldChangeStatusBarTintToDark,int type ) {
        if (Build.VERSION.SDK_INT >= 21) {

            Activity activity= (Activity) context;
            Window window = activity.getWindow();
            View view=window.getDecorView();
            if (shouldChangeStatusBarTintToDark) {
                view.setSystemUiVisibility(view.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR);
            } else {
                // We want to change tint color to white again.
                // You can also record the flags in advance so that you can turn UI back completely if
                // you have set other flags before, such as translucent or full screen.
                view.setSystemUiVisibility(0);
            }


            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(color);
        }
    }

    public void addSwipeTheme(SwipeRefreshLayout swipeLayout, Integer color){
        swipeLayout.setColorSchemeResources(color,color,color,color);
    }

    public String lastCharSkip(String demoString,String charString){

        if(demoString.endsWith(","))
        {
            demoString = demoString.substring(0,demoString.length() - 1);
        }
        return demoString;
    }


    public String getFormatedDate(long timeStamp,String format){
        StringBuilder stringBuilder=new StringBuilder();

        timeStamp=timeStamp*1000;
        Date from= new Date(timeStamp);
        Calendar cal = new GregorianCalendar();
        cal.setTime(from);
        Format formatter = new SimpleDateFormat(format);
        String today = formatter.format(from);
        stringBuilder.append(today);

        return today;
    }




/*
    public Integer getColo(String key){
        int color=0;
        HashMap<String,String> colorMap=getProfileColorSchema();
        if(key.contains("_")){
            key=key.replace("_"," ");
        }
        if(colorMap.containsKey(key)){
            color=Color.parseColor(colorMap.get(key));
        }

        return color;
    }
*/



    public Date setDefaultDate(int year,int month,int day){

        Date initialDate = new Date();
        initialDate.setYear(year);
        initialDate.setMonth(month);
        initialDate.setDate(day);
        return initialDate;


    }


    public Date setStartDate(int year){
        Date startDate = new Date();
        startDate.setYear(year);
        startDate.setMonth(1);
        startDate.setDate(1);
        return startDate;
    }

    public Date setEndDate(int year){
        Date endDate = new Date();
        endDate.setYear(year);
        endDate.setMonth(1);
        endDate.setDate(1);
        return endDate;
    }



    public long getDateFromString(String startDateString){
        long dateValue=0;
       // DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.UK);

        //SimpleDateFormat format =

        Date startDate;
        try {
            startDate = df.parse(startDateString);
            dateValue=startDate.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dateValue;
    }


    public long getDate(String startDateString){
        long dateValue=0;
        // DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
        SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-dd");

        //SimpleDateFormat format =

        Date startDate;
        try {
            startDate = df.parse(startDateString);
            dateValue=startDate.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dateValue;
    }

    public  void showProgressBar(Context context){
        if(context!=null){
            myProgressDialog = ProgressDialog.show(context, null, null, true, false);
            myProgressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);

            myProgressDialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);


            myProgressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            myProgressDialog.setCancelable(true);
            myProgressDialog.setIndeterminate(true);
            myProgressDialog.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
            myProgressDialog.setContentView(R.layout.layout_progress);  //R.layout.layout_progress_dialog
            myProgressDialog.show();
        }


    }

    public  void hideProgressBar(){
        if(myProgressDialog!=null)
            myProgressDialog.dismiss();
    }




    public ObjectMapper getMapper() {
        ObjectMapper mapper=null;
        try{
            mapper=new ObjectMapper();

        }catch (Exception e){
            e.printStackTrace();
        }
        return mapper;
    }



    public BottomSheetDialog getBottomSheet(Context context, int layout, ArrayList<RankingListModel> list, String title, MenuClickListener listener){



        BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(context);

        bottomSheetDialog.setContentView(layout);

        RecyclerView barRecycler= (RecyclerView) bottomSheetDialog.findViewById(R.id.bar_details_recycler_view);

        AppCompatTextView detailsTitle= (AppCompatTextView) bottomSheetDialog.findViewById(R.id.bar_details_title);
        if(title==null){
            detailsTitle.setVisibility(View.GONE);
        }else{
            detailsTitle.setText(title);
        }
        barRecycler.setLayoutManager(CommonUtil.getInstance().getVerticalLayoutManager(context));

        SortListAdapter adapter=new SortListAdapter(list,listener);

        barRecycler.setAdapter(adapter);

        bottomSheetDialog.show();

        return bottomSheetDialog;
    }

    public void setProfileBackground(Context context,CircleView profileImage, String name) {
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
