package com.exmvp.example.base;

import android.util.Log;

import com.framework.mvp.EXMVPBasePresenter;
import com.framework.mvp.EXMVPView;


/**
 * Created by Daniel on 2019/1/2.
 */
public class EXBasePresenter<V extends EXBasePresenter.BaseView> extends EXMVPBasePresenter<V> {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.v("EXBasePresenter", "-----onCreate-----");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.v("EXBasePresenter", "-----onResume-----");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.v("EXBasePresenter", "-----onPause-----");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.v("EXBasePresenter", "-----onDestroy-----");
    }

    public interface BaseView extends EXMVPView {
        void showProgress();
        void hideProgress();
    }
}
