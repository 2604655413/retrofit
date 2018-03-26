package com.qf.retrofit.okhttp;

import android.content.Context;

import com.qf.retrofit.okhttp.interceptor.OfflineCacheControlInterceptor;
import com.qf.retrofit.util.CacheUtil;

import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * 初始化OkhttpClient
 */
public class OkhttpClientUtil {
    private int TIMEOUT=30;
    private int READOUT=30;
    private Interceptor cacheInterceptor = new OfflineCacheControlInterceptor();

    private OkhttpClientUtil() {
    }

    private static class ClientHolder {
        private static OkhttpClientUtil clientUtil = new OkhttpClientUtil();
    }

    public static OkhttpClientUtil getClient() {
        return ClientHolder.clientUtil;
    }

    public OkHttpClient initClient(Context context) {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)//添加拦截器
                .cache(CacheUtil.getCache(context))//设置Cache目录
                .addInterceptor(cacheInterceptor)//缓存拦截器
                .addNetworkInterceptor(cacheInterceptor)
                .retryOnConnectionFailure(true)
                .connectTimeout(TIMEOUT, TimeUnit.SECONDS)//设置超时时间
                .readTimeout(READOUT, TimeUnit.SECONDS)
                .build();
        return client;
    }
}
