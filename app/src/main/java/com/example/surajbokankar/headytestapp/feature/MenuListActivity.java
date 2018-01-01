package com.example.surajbokankar.headytestapp.feature;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.surajbokankar.headytestapp.R;
import com.example.surajbokankar.headytestapp.feature.category.MenuClickListener;
import com.example.surajbokankar.headytestapp.feature.category.OnCategoryAPISuccess;
import com.example.surajbokankar.headytestapp.feature.category.adapter.MenuListAdapter;
import com.example.surajbokankar.headytestapp.feature.category.fragment.CategoryListFragment;
import com.example.surajbokankar.headytestapp.feature.category.model.MainMenuModel;
import com.example.surajbokankar.headytestapp.feature.category.model.MenuModel;
import com.example.surajbokankar.headytestapp.util.CommonUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

public class MenuListActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,OnCategoryAPISuccess,MenuClickListener {

    private static final String TAG = "MenuListActivity";
    RecyclerView menuRecyclerView=null;
    Toolbar toolbar=null;
    LinearLayoutManager linearLayoutManager=null;
    CategoryViewModel viewModel=null;
    Context context=null;
    ArrayList<MainMenuModel> modelArrayList=null;
    MenuListAdapter menuAdapter=null;
    FrameLayout container=null;
    DrawerLayout drawer=null;
    FragmentManager fragmentManager=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_list);
        initViews();

    }

      private void initViews() {
          toolbar = (Toolbar) findViewById(R.id.toolbar);
          menuRecyclerView=findViewById(R.id.menu_recycler_view);
          container=findViewById(R.id.content);
           context=MenuListActivity.this;
          setToolBar();
          setDefaultMenuView();


          /*//FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/



       /* NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);*/
    }

    private void setToolBar() {
        setSupportActionBar(toolbar);
         drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }

    private void setDefaultMenuView() {

        viewModel=CategoryViewModel.getCategoryViewModel();
        viewModel.getCategoryApi(context,this);

        linearLayoutManager= CommonUtil.getInstance().getVerticalLayoutManager(context);
        modelArrayList=new ArrayList<>();
        menuAdapter=new MenuListAdapter(modelArrayList,this);
        menuRecyclerView.setLayoutManager(linearLayoutManager);
        menuRecyclerView.setAdapter(menuAdapter);

    }


    private void setContainer(MainMenuModel menuModel) {

        String response=null;
        try{

            ObjectMapper objectMapper=new ObjectMapper();
             response=objectMapper.writeValueAsString(menuModel);
        }catch (Exception e){
            Log.i(TAG, "setContainer: Values="+e.getMessage());
        }


        CategoryListFragment categoryListFragment=CategoryListFragment.getFragment(response);
        fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.content,categoryListFragment).addToBackStack(menuModel.categoryTitle).commitAllowingStateLoss();


    }

    @Override
    public void onBackPressed() {
        //DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        //DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onCategoryAPiSuccess(MenuModel parentResponse) {
      modelArrayList.addAll(parentResponse.menuModels);
      menuAdapter.notifyDataSetChanged();
    }

    @Override
    public void onError(String error) {
     CommonUtil.getInstance().showToast(context,error);
    }

    @Override
    public void onMenuClick(MainMenuModel menuModel) {
        drawer.closeDrawer(GravityCompat.START);
        setContainer(menuModel);
    }

    @Override
    public void onBottomMenuClick(ArrayList<MainMenuModel> menuModel) {

    }
}
