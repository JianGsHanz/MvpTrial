package com.example.mvptrial.ui.splash

import android.annotation.SuppressLint
import com.example.mvptrial.base.BasePresenter
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit

/**
 *Time:2019/5/20
 *Author:zyh
 *Description:
 */
class SplashPresenter : BasePresenter<SplashContract.view>(), SplashContract.presenter {

    @SuppressLint("CheckResult")
    override fun loadData() {
        super.loadData()
        registerRx(Observable.interval(0,1,TimeUnit.SECONDS)
            .take(5)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ t ->
                val a = t.toInt()
                mView!!.setInterval(4 - a)
                if (a == 4){
                    mView!!.result()
                }
            }, { }))
    }
}