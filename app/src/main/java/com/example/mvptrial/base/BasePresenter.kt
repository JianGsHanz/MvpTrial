package com.example.mvptrial.base

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 *Time:2019/5/20
 *Author:zyh
 *Description:
 */
open class BasePresenter<V : IBaseView> : IBasePresenter {

    var mView : V? = null
    var mCompositeDisposable : CompositeDisposable? = null
    override fun loadData() {
    }

    fun attachView(view: V){
        mView = view
    }

    fun detachView(){
        mView == null
        clearRx()
    }

    fun registerRx(d : Disposable){
        if (mCompositeDisposable == null){
            mCompositeDisposable = CompositeDisposable()
        }
        mCompositeDisposable!!.add(d)
    }
    private fun clearRx() {
        if (mCompositeDisposable != null){
            mCompositeDisposable!!.clear()
        }
    }
}
