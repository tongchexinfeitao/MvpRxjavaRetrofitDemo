package com.example.mvprxjavaretrofitdemo.view.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.mvprxjavaretrofitdemo.R;
import com.example.mvprxjavaretrofitdemo.presenter.RegisterPresenter;
import com.example.mvprxjavaretrofitdemo.view.IRegisterView;

public class MainActivity extends AppCompatActivity implements IRegisterView {

    private RegisterPresenter mRegisterPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRegisterPresenter = new RegisterPresenter(this);
    }

    public void register(View view) {
        mRegisterPresenter.register();
    }

    @Override
    public void registerSucceed() {
        Toast.makeText(MainActivity.this, "注册成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void registerFaid() {
        Toast.makeText(MainActivity.this, "注册失败", Toast.LENGTH_SHORT).show();
    }

    @Override
    public Context context() {
        return this;
    }
}
