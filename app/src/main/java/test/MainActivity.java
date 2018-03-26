package test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.yhh.retrofit.R;
import com.yhh.retrofit.api.Api;
import com.yhh.retrofit.module.BaseBean;
import com.yhh.retrofit.module.DataBean;
import com.yhh.retrofit.retrofit.RetrofitManager;
import com.yhh.retrofit.retrofit.RetrofitUtil;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tvContent = findViewById(R.id.tvContent);
        final Button click = findViewById(R.id.click);


        Api api = RetrofitResponse.initApi(getApplicationContext());
        api.getCall("shentong", "3352441116109").clone().enqueue(new RetrofitManager<BaseBean<DataBean>>(){
            @Override
            public void onResponse(Call<BaseBean<DataBean>> call, Response<BaseBean<DataBean>> response) {
                super.onResponse(call, response);
            }



        });


    }


}
