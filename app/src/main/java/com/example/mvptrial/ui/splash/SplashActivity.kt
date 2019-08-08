package com.example.mvptrial.ui.splash

import android.content.Intent
import com.example.mvptrial.App
import com.example.mvptrial.R
import com.example.mvptrial.base.BaseActivity
import com.example.mvptrial.ui.main.MainActivity
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : BaseActivity<SplashContract.view,SplashPresenter>(),SplashContract.view {

    override fun getLayoutId(): Int = R.layout.activity_splash

    override fun initViewAndEvent() {

    }
    override fun setInterval(i: Int) {
        tv.text = "倒计时 $i"
    }
    override fun result() {
        startActivity(Intent(this,MainActivity::class.java))
        finish()
    }

    override fun inject() {
        App.app!!.getActivityCommponent(this).inject(this)
    }

}
