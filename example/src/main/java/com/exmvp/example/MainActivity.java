package com.exmvp.example;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Toast;

import com.exmvp.example.base.EXBaseActivity;
import com.framework.mvp.EXMVPresenter;

import daniel.exmvp.R;


public class MainActivity extends EXBaseActivity implements MainPresenter.View {

    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        mPresenter.sendLoginRequest();
    }

    @NonNull
    @Override
    public EXMVPresenter createPresenter() {
        mPresenter = new MainPresenter();
        return mPresenter;
    }

    @Override
    public void successView() {
        Toast.makeText(this, "Successful~", Toast.LENGTH_LONG).show();
    }
}
