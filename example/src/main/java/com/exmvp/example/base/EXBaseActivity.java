package com.exmvp.example.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.framework.mvp.EXMVPBaseAppCompatActivity;

/**
 * Created by Daniel on 2019/1/2.
 */
public abstract class EXBaseActivity extends EXMVPBaseAppCompatActivity {

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
        getPresenter();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("EXBaseActivity", "-----onCreate-----");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("EXBaseActivity", "-----onResume-----");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("EXBaseActivity", "-----onPause-----");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("EXBaseActivity", "-----onDestroy-----");
    }

    public void showProgress() {
        // TODO ...
    }

    public void hideProgress() {
        // TODO ...
    }
}
