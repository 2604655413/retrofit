package com.qf.retrofit.retrofit;

import android.content.Context;


import com.qf.retrofit.api.Api;
import com.qf.retrofit.util.LogUtil;
import com.qf.retrofit.util.ToastUtil;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetrofitManager<T> implements Callback<T>{

    private static Context context;
    public static Api initApi(Context context){
        Api api = RetrofitUtil.getRetrofit().initRetrofit(context).create(Api.class);
        context=context;
        return api;
    }

    @Override
    public void onResponse(Call<T> call, Response<T> response) {

    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {
        if (t instanceof SocketTimeoutException) {
            ToastUtil.showShort(context, "网络连接超时，请稍后重试！");
        } else if (t instanceof ConnectException || t instanceof UnknownHostException || t instanceof UnknownServiceException) {
            ToastUtil.showShort(context, "网络连接异常，请检查网络设置！");
        } else {
            String message = t.getMessage();
            LogUtil.e(message);
        }
    }
}
