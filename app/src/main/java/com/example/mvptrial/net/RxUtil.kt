package com.example.mvptrial.net

import io.reactivex.ObservableTransformer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 *Time:2019/6/14
 *Author:zyh
 *Description:
 */
object RxUtil{
    /**
     * 统一线程处理
     *
     * @param <T>
     * @return
    </T> */
    fun <T> rxSchedulerHelper(): ObservableTransformer<T, T> {    //compose简化线程
        return ObservableTransformer { observable ->
            observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
        }
    }
}