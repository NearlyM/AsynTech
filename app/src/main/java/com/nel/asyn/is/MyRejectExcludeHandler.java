package com.nel.asyn.is;

import android.widget.Toast;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Description : 自定义拒绝策略
 * CreateTime : 2018/5/11 9:21
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 */

public class MyRejectExcludeHandler implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
    }
}
