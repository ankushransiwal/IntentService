package com.example.android.restful.services;

import android.app.IntentService;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;


public class MyService extends IntentService {

    public static final String TAG = "MyService";
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name(Removed) Used to name the worker thread, important only for debugging.
     */
    public MyService() {
        //Removing String arguments to make it simpler
        super("MyService");
    }

    @Override
    protected void onHandleIntent( Intent intent) {
        Uri uri = intent.getData();
        Log.i(TAG, "onHandleIntent: " + uri.toString());

    }
}
