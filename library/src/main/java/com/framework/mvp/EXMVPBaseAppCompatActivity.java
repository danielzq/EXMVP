package com.framework.mvp;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Daniel on 2018/12/27.
 */
public abstract class EXMVPBaseAppCompatActivity<P extends EXMVPresenter> extends AppCompatActivity implements EXMVPView {

    private P mPresenter;

    @NonNull
    public abstract P createPresenter();

    /**
     * Subclass can get the bound presenter by calling this method.
     *
     * @return Bound presenter
     */
    protected P getPresenter() {
        try {
            if (mPresenter == null) {
                mPresenter = createPresenter();
                mPresenter.attachView(this);
            }
            getLifecycle().addObserver(mPresenter);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mPresenter;
    }

}
