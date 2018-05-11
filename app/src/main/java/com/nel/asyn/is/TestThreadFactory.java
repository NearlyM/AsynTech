package com.nel.asyn.is;

import android.support.annotation.NonNull;

import java.util.concurrent.ThreadFactory;

/**
 * Description :
 * CreateTime : 2018/5/11 9:19
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 */

public class TestThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(@NonNull Runnable r) {
        return new Thread(r);
    }
}
