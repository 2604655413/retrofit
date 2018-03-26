package com.qf.retrofit.util;

import android.content.Context;

import java.io.File;

import okhttp3.Cache;
public class CacheUtil {

    private static final int HTTP_RESPONSE_DISK_CACHE_MAX_SIZE = 100 * 1024 * 1024;

    private static File getCacheDir(Context context) {
        //设置缓存路径
        final File baseDir = StorageUtil.getCacheDir(context);
        final File cacheDir = new File(baseDir, "HttpResponseCache");
        return cacheDir;
    }

    public static Cache getCache(Context context) {
        return new Cache(getCacheDir(context), HTTP_RESPONSE_DISK_CACHE_MAX_SIZE);
    }
}
