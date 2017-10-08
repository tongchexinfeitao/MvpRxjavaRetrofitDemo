package com.example.mvprxjavaretrofitdemo.model;

import com.example.mvprxjavaretrofitdemo.constant.IRegisterApi;
import com.example.mvprxjavaretrofitdemo.utils.RetrofitManager;

import io.reactivex.Observable;
import okhttp3.ResponseBody;

/**
 * Created by hasee on 2017/10/8.
 *
 * model里面利用retrofit构造了一个被观察者
 */

public class RegisterModel implements IRegisterModel {

    @Override
    public Observable<ResponseBody> register() {

       //// TODO: 2017/10/8 需要拿到一个Observable ，从retrofit中拿
        return RetrofitManager.getDefault().create(IRegisterApi.class).register();
    }
}
