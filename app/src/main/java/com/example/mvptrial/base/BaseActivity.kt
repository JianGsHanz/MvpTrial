package com.example.mvptrial.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.mvptrial.main.MainContract

/**
 *Time:2019/5/20
 *Author:zyh
 *Description:
 */
abstract class BaseActivity<V: IBaseView,P : BasePresenter<V>> : AppCompatActivity(),
    IBaseView {

    lateinit var mPresenter : P
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())

        mPresenter = getPresenter()
        if (mPresenter != null){
            mPresenter.attachView(this as V)
        }
        mPresenter.loadData()
        initViewAndEvent()
    }

    abstract fun getLayoutId(): Int
    abstract fun getPresenter() : P
    abstract fun initViewAndEvent()


    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
    }
}