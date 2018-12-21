package com.mingshan.packagenameviewer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class SplashActivity extends AppCompatActivity {
    private Disposable mDisposable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //全屏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
//        initView();
    }

//    private void initView() {
//
//        int count_time = 10; //总时间
//        Observable.interval(0, 1, TimeUnit.SECONDS)
//                .take(count_time+1)//设置总共发送的次数
//                .map(new Function<Long, Long>() {
//                    @Override
//                    public Long apply(Long aLong) throws Exception {
//                        //aLong从0开始
////                        return  count_time-aLong;
//                    }
//                })
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Observer<Long>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//                        mDisposable = d;
//                    }
//
//                    @Override
//                    public void onNext(Long value) {
//                        //Log.d("Timer",""+value);
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        // TODO:2017/12/1
//                        if (mDisposable != null) {
//                            mDisposable.dispose();
//                    }
//                    }
//                });
//
//
//        Observable.interval(1000, TimeUnit.MICROSECONDS).observeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<Long>() {
//
//            @Override
//            public void onSubscribe(Disposable d) {
//
//            }
//
//            @Override
//            public void onNext(Long aLong) {
////                time++;
////                if (time >=3){
////
////                    finish();
////                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
////                }
//
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onComplete() {
//
//            }
//        });
//    }
}
