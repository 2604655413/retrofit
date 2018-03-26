package test;

import android.content.Context;

import com.yhh.retrofit.api.Api;
import com.yhh.retrofit.module.BaseBean;
import com.yhh.retrofit.module.DataBean;
import com.yhh.retrofit.retrofit.RetrofitUtil;
import com.yhh.retrofit.util.LogUtil;
import com.yhh.retrofit.util.ToastUtil;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

public class RetrofitTest {

    private static class TestHolder{
        private static RetrofitTest retrofitTest=new RetrofitTest();
    }

    public static RetrofitTest getTest(){
        return TestHolder.retrofitTest;
    }

    public void getSuccess(Context context,RetrofitResponse retrofitResponse){
        new retrofit2.Callback<BaseBean<DataBean>>() {
            @Override
            public void onResponse(Call<BaseBean<DataBean>> call, Response<BaseBean<DataBean>> response) {
                int code = response.body().getCode();
                if(code==200){
                    retrofitResponse.onSuccess(response.body().getData());
                }
            }

            @Override
            public void onFailure(Call<BaseBean<DataBean>> call, Throwable t) {
                if (t instanceof SocketTimeoutException) {
                    ToastUtil.showShort(context, "网络连接超时，请稍后重试！");
                } else if (t instanceof ConnectException || t instanceof UnknownHostException || t instanceof UnknownServiceException) {
                    ToastUtil.showShort(context, "网络连接异常，请检查网络设置！");
                } else {
                    String message = t.getMessage();
                    LogUtil.e(message);
                }
            }
        };
    }

}
