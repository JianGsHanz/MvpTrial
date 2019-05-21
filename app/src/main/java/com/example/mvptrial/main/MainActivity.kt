package com.example.mvptrial.main

import android.os.Bundle
import com.example.mvptrial.R
import com.example.mvptrial.base.BaseActivity

class MainActivity : BaseActivity<MainContract.view , MainPresenter>(),
    MainContract.view {
    override fun getPresenter(): MainPresenter = MainPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun getLayoutId(): Int = R.layout.activity_main

    override fun initViewAndEvent() {

    }
}
