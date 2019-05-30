package com.example.mvptrial.ui.main

import com.example.mvptrial.base.IBasePresenter
import com.example.mvptrial.base.IBaseView

/**
 *Time:2019/5/20
 *Author:zyh
 *Description:
 */
interface MainContract{
    interface view : IBaseView {
        fun showCharacter(result : String)
        fun showImg(url : String)
    }
    interface presenter : IBasePresenter {
        fun getBannerData()
    }
}