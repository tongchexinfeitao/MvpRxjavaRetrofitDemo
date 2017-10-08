package com.example.mvprxjavaretrofitdemo.model;

import io.reactivex.Observable;
import okhttp3.ResponseBody;

/**
 * Created by hasee on 2017/10/8.
 */

public interface IRegisterModel {

    Observable<ResponseBody> register();
}
