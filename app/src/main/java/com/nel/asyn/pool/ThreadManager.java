package com.nel.asyn.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Description :
 * CreateTime : 2018/5/10 14:20
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 */

public class ThreadManager {
    private static final int CPU_COUNT = Runtime.getRuntime().availableProcessors();
    private static final int CORE_NUM = CPU_COUNT + 1;
    private static final int MAX_NUM = CPU_COUNT * 2 + 1;
    private ThreadPoolExecutor mThreadPoolExecutor;
    private ArrayBlockingQueue<Runnable> mWorkQueue;

    private ThreadManager() {
        mWorkQueue = new ArrayBlockingQueue<>(200);
        mThreadPoolExecutor = new ThreadPoolExecutor(CORE_NUM,
                MAX_NUM,
                1000,
                TimeUnit.MILLISECONDS,
                mWorkQueue);
    }

    public void put(Runnable runnable) {
        try {
            mWorkQueue.put(runnable);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void exeute() {
        mThreadPoolExecutor.execute(mWorkQueue.poll());
    }
}
