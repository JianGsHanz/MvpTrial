package com.example.mvptrial.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import javax.inject.Inject

/**
 *Time:2019/5/20
 *Author:zyh
 *Description:
 */
abstract class BaseActivity<P : BasePresenter<*>> : AppCompatActivity(),
    IBaseView {

    @Inject
    lateinit var mPresenter : P

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())

        inject()
        mPresenter.attachView(this)
        mPresenter.loadData()
        initViewAndEvent()
    }

    abstract fun getLayoutId(): Int
    abstract fun inject()
    abstract fun initViewAndEvent()


    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
    }
}