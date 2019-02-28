package com.framework.mvp;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.support.annotation.UiThread;

/**
 * Created by Daniel on 2018/12/27.
 */
public interface EXMVPresenter<V extends EXMVPView> extends LifecycleObserver {

    /**
     * After the method is invoked, it shows that the binding View has been initialized
     * , and it can safely use getView () to call every way of View.
     * <p>
     * Before each presenter performs other business methods, onCreate () must call at least once.
     *
     */
    @UiThread
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void onCreate();

    @UiThread
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void onStart();

    @UiThread
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void onResume();

    @UiThread
    void attachView(V view);

    @UiThread
    void detachView();

    @UiThread
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void onPause();

    @UiThread
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void onStop();

    @UiThread
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestroy();
}
