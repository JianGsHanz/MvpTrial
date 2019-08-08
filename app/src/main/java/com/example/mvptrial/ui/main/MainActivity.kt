package com.example.mvptrial.ui.main

import com.example.mvptrial.App
import com.example.mvptrial.R
import com.example.mvptrial.base.BaseActivity
import com.example.mvptrial.toast
import com.example.mvptrial.util.ImageUtlis
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<MainContract.view , MainPresenter>(),
    MainContract.view {

    override fun getLayoutId(): Int = R.layout.activity_main

    override fun initViewAndEvent() {
        bt.setOnClickListener {
            toast("正在请求") //扩展函数
            mPresenter.getBannerData()
        }
    }

    override fun showCharacter(result: String) {
        tv.text = result
    }

    override fun showImg(url: String) {
        ImageUtlis.loadImage(this,url,iv)
    }

    override fun inject() {
        App.app!!.getActivityCommponent(this).inject(this)
    }

}
