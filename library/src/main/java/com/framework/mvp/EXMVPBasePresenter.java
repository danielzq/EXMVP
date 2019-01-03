package com.framework.mvp;

import android.support.annotation.Nullable;
import android.support.annotation.UiThread;

import java.lang.ref.WeakReference;

/**
 * Created by Daniel on 2018/12/27.
 */
public class EXMVPBasePresenter<V extends EXMVPView> implements EXMVPresenter<V> {

    private WeakReference<V> viewRef;

    @UiThread
    @Nullable
    public V getView() {
        return viewRef == null ? null : viewRef.get();
    }

    /**
     * Each time the business request is invoked, is getView ().ShowXxx ().
     * Please first call the method to check whether to establish connection with View, or no null pointer exception.
     *
     */
    public final boolean isViewAttached() {
        return viewRef != null && viewRef.get() != null;
    }

    @UiThread
    @Override
    public void onCreate() {

    }
    @UiThread
    @Override
    public void onResume() {

    }

    @UiThread
    @Override
    public void attachView(V view) {
        viewRef = new WeakReference<>(view);
    }

    @UiThread
    @Override
    public void detachView() {
        if (viewRef != null) {
            viewRef.clear();
            viewRef = null;
        }
    }

    @UiThread
    @Override
    public void onPause() {

    }

    @UiThread
    @Override
    public void onDestroy() {
        if (isViewAttached()) {
            detachView();
        }
    }
}
