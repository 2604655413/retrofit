package test;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface TestApi {
//    @Headers({
//
//    })

    @GET("query")
    Call<JsonRootBean<Data>> getCall(@Query("type") String type, @Query("postid") String postid);

    @GET("search")
    Call<TestBean> call();
}
