package com.example.parsatagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    public static final String APP_ID = BuildConfig.APP_ID;
    public static final String CLIENT_KEY = BuildConfig.CLIENT_KEY;

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId(APP_ID)
                .clientKey(CLIENT_KEY)
                .server(getString(R.string.back4app_server_url))
                .build());
    }
}
