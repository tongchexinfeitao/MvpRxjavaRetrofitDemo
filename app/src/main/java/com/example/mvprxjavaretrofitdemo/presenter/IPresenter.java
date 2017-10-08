package com.example.mvprxjavaretrofitdemo.presenter;

import android.content.Context;

import com.example.mvprxjavaretrofitdemo.app.App;
import com.example.mvprxjavaretrofitdemo.view.IView;

/**
 * Created by hasee on 2017/10/8.
 */

public class IPresenter<T extends IView> {
    protected T view;

    public IPresenter(T view) {
        this.view = view;
        init();
    }

    protected void init() {

    }

    public Context context() {
        if (view != null && view.context() != null) {
            return view.context();
        }
        return App.context();
    }
}
