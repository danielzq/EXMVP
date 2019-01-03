package com.exmvp.example;


import android.os.Handler;

import com.exmvp.example.base.EXBasePresenter;


/**
 * Created by Daniel on 2019/1/2.
 */
public class MainPresenter extends EXBasePresenter<MainPresenter.View> {

    public void sendLoginRequest() {
        if (isViewAttached()) {
            getView().showProgress();
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (isViewAttached()) {
                    getView().hideProgress();
                    getView().successView();
                }
            }
        }, 3000);
    }

    interface View extends EXBasePresenter.BaseView {

        void successView();
    }
}
