package test;


import android.content.Context;

import com.yhh.retrofit.api.Api;
import com.yhh.retrofit.module.DataBean;
import com.yhh.retrofit.retrofit.RetrofitUtil;

import java.util.List;

public abstract class RetrofitResponse {
    private static Context context;
    public RetrofitResponse(){}
    public static Api initApi(Context context){
        Api api = RetrofitUtil.getRetrofit().initRetrofit(context).create(Api.class);
        context=context;
        return api;
    }

    public void response(){
        RetrofitTest.getTest().getSuccess(context,RetrofitResponse.this);
    }
    abstract void onSuccess(List<DataBean> data);
}
