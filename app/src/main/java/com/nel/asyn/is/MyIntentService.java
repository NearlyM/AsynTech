package com.nel.asyn.is;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Description :
 * CreateTime : 2018/5/10 9:54
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 */

public class MyIntentService extends IntentService {

    public static final String TAG = "AsynTest";

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     */
    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.e(TAG, "MyIntentService onHandleIntent");
        Log.e(TAG, "currentThread name : " + Thread.currentThread().getName());
        Log.e(TAG, "intent name : " + intent.getStringExtra("name"));
    }

    @Override
    public void onStart(@Nullable Intent intent, int startId) {
        super.onStart(intent, startId);
    }
}
