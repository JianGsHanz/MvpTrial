package com.example.mvptrial.main

import com.example.mvptrial.base.IBasePresenter
import com.example.mvptrial.base.IBaseView

/**
 *Time:2019/5/20
 *Author:zyh
 *Description:
 */
interface MainContract{
    interface view : IBaseView {}
    interface presenter : IBasePresenter {}
}