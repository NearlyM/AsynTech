package com.nel.asyn;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.nel.asyn.is.MyIntentService;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * Description :
 * CreateTime : 2018/5/10 10:41
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 */

public class EventHandler {

    private Context context;

    EventHandler(Context context) {
        this.context = context;
    }

    public void onClickAsyn(View view) {

    }

    public void onClickIS(View view) {
        Intent service = new Intent();
        service.setClass(context, MyIntentService.class);
        service.putExtra("name", "ningerlei");
        context.startService(service);
    }

    public void onClickTp(View view) {
    }

    public void onClickHT(View view) {

    }
}
