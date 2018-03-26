package com.qf.retrofit.api;

import com.qf.retrofit.module.BaseBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import test.TestBean;

public interface Api {
//    @Headers({
//
//    })

    @GET("query")
    Call<BaseBean<TestBean.DataBean>> getCall(@Query("type") String type, @Query("postid") String postid);
}
