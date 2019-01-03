package com.framework.mvp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by Daniel on 2018/12/27.
 */
public abstract class EXMVPBaseFragment<P extends EXMVPresenter> extends Fragment implements EXMVPView {

    private P mPresenter;

    @NonNull
    public abstract P createPresenter();

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getPresenter();
        getLifecycle().addObserver(mPresenter);
    }

    /**
     * Subclass can get the bound presenter by calling this method.
     *
     * @return Bound presenter
     */
    protected P getPresenter() {
        if (mPresenter == null) {
            mPresenter = createPresenter();
            mPresenter.attachView(this);
        }
        getLifecycle().addObserver(mPresenter);
        return mPresenter;
    }

}
