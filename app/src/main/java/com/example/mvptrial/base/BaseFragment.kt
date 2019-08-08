package com.example.mvptrial.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import javax.inject.Inject

/**
 *Time:2019/8/8
 *Author:zyh
 *Description:
 */
abstract class BaseFragment<V : IBaseView, P : BasePresenter<V>> : Fragment(), IBaseView {

    @Inject
    lateinit var mPresenter: P

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(getLayoutId(),null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        inject()
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mPresenter?.attachView(this as V)
        mPresenter?.loadData()
        initView()
    }

    abstract fun getLayoutId(): Int
    abstract fun inject() //初始化dagger注入
    abstract fun initView()

    override fun onDestroy() {
        super.onDestroy()
        mPresenter?.detachView()
    }
}