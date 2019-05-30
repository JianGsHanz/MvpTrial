package com.example.mvptrial.ui.main

import android.util.Log
import com.example.mvptrial.base.BasePresenter
import com.example.mvptrial.net.RetrofitUtil
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 *Time:2019/5/20
 *Author:zyh
 *Description:
 */
class MainPresenter : BasePresenter<MainContract.view>(),MainContract.presenter{

    override fun getBannerData() {
        val map = mapOf<String,String>("adType" to "1","adUser" to "1")
        registerRx(RetrofitUtil.getApis().getBanner(map)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                if (it.data.isNotEmpty()){
                    mView!!.showImg(it.data[0].img_url)
                }
                mView!!.showCharacter(it.toString())
            }, {
                Log.e("","${it.message}")
            }))
    }

}