package com.example.surajbokankar.headytestapp.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by suraj.bokankar on 15/3/17.
 */

public class NetworkManager {

    public static NetworkManager networkManager = null;


    public static NetworkManager getInstance() {
        if (networkManager == null) {
            networkManager = new NetworkManager();
        }
        return networkManager;
    }

    public boolean isConnectingToInternet(Context context) {
        ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity != null) {
            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null)
                for (int i = 0; i < info.length; i++)
                    if (info[i].getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }

        }
        return false;
    }


}
