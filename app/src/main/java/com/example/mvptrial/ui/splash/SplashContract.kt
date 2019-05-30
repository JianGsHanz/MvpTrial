package com.example.mvptrial.ui.splash

import com.example.mvptrial.base.IBasePresenter
import com.example.mvptrial.base.IBaseView

/**
 *Time:2019/5/20
 *Author:zyh
 *Description:
 */
interface SplashContract{
    interface view : IBaseView {
        fun setInterval(i : Int)
        fun result()
    }
    interface presenter : IBasePresenter {
    }
}