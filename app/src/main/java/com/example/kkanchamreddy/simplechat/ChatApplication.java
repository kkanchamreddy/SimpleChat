package com.example.kkanchamreddy.simplechat;

import android.app.Application;

import com.example.kkanchamreddy.simplechat.models.Message;
import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by kkanchamreddy on 12/16/15.
 */
public class ChatApplication extends Application {
    public static final String YOUR_APPLICATION_ID = "Ugj2mtIB9bexQogt4ZiA1DlbA1NRAFa1UrVflj7S";
    public static final String YOUR_CLIENT_KEY = "t36WSNniciNXEESpdEBYpwxFvsrGJ71d7r57DtiY";
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models here
        ParseObject.registerSubclass(Message.class);

        Parse.enableLocalDatastore(this);
        //Parse.initialize(this, YOUR_APPLICATION_ID, YOUR_CLIENT_KEY);
        Parse.initialize(this);
    }
}
