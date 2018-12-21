package com.mingshan.packagenameviewer;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() {
//        assertEquals(4, 2 + 2);
//    }
        Observable.interval(1, TimeUnit.MILLISECONDS)
                .observeOn(Schedulers.io())
                .subscribe(new Observer<Long>() {
                            @Override
                            public void onSubscribe(@NonNull Disposable disposable) {
                            }

                            @Override
                            public void onNext(@NonNull Long number) {

                                System.out.print(number);
                            }

                            @Override
                            public void onError(@NonNull Throwable e) {

                            }

                            @Override
                            public void onComplete() {
                                System.out.print("sad");
                            }
                        });



    }
}