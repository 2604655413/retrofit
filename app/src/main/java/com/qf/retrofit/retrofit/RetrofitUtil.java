package com.qf.retrofit.retrofit;

import android.content.Context;

import com.google.gson.Gson;
import com.qf.retrofit.base.BaseurlUtil;
import com.qf.retrofit.okhttp.OkhttpClientUtil;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
/**
 * 初始化Retrofit
 */
public class RetrofitUtil {

    private RetrofitUtil() {
    }

    private static class RetrofitHolder {
        private static RetrofitUtil retrofittUtil = new RetrofitUtil();
    }

    public static RetrofitUtil getRetrofit() {
        return RetrofitHolder.retrofittUtil;
    }

    public Retrofit initRetrofit(Context context) {

        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(BaseurlUtil.getBaseUrl().getUrl())
                .client(OkhttpClientUtil.getClient().initClient(context))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();
        return retrofit;
    }
}
