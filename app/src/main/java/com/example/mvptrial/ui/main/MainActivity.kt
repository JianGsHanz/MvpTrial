package com.example.mvptrial.ui.main

import android.os.Bundle
import com.example.mvptrial.R
import com.example.mvptrial.base.BaseActivity
import com.example.mvptrial.util.ImageUtlis
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<MainContract.view , MainPresenter>(),
    MainContract.view {

    override fun getPresenter(): MainPresenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun getLayoutId(): Int = R.layout.activity_main

    override fun initViewAndEvent() {
        bt.setOnClickListener {
            mPresenter.getBannerData()
        }
    }

    override fun showCharacter(result: String) {
        tv.text = result
    }

    override fun showImg(url: String) {
        ImageUtlis.loadImage(this,url,iv)
    }
}
