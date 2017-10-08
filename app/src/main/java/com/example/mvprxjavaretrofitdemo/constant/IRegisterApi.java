package com.example.mvprxjavaretrofitdemo.constant;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;

/**
 * Created by hasee on 2017/10/8.
 */

public interface IRegisterApi {
    @GET("http://www.baidu.com")
    Observable<ResponseBody> register();
}
