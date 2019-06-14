package com.example.mvptrial.ui.main

import android.content.Context
import android.util.Log
import com.example.mvptrial.base.BasePresenter
import com.example.mvptrial.bean.BannerResult
import com.example.mvptrial.bean.CommonResult
import com.example.mvptrial.net.Observe
import com.example.mvptrial.net.RetrofitHelper
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 *Time:2019/5/20
 *Author:zyh
 *Description:
 */
class MainPresenter(context: Context) : BasePresenter<MainContract.view>(), MainContract.presenter {
    var contexts : Context = context
    override fun getBannerData() {
        val map = mapOf<String, String>("adType" to "1", "adUser" to "1")
//        registerRx(RetrofitUtil.getApis().getBanner(map)
//            .subscribeOn(Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribe({
//                if (it.data.isNotEmpty()){
//                    mView!!.showImg(it.data[0].img_url)
//                }
//                mView!!.showCharacter(it.toString())
//            }, {
//                Log.e("","${it.message}")
//            }))
//        RetrofitUtil.getApis().getBanner(map)
//            .subscribeOn(Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribe(object : Observe<BannerResult>(contexts!!) {
//                override fun onSuccess(t: CommonResult<BannerResult>) {
//                    t as BannerResult
//                    if (t.data.isNotEmpty()) {
//                        mView!!.showImg(t.data[0].img_url)
//                    }
//                    mView!!.showCharacter(t.toString())
//                }
//
//                override fun onFailure() {
//                    Log.e("", "")
//                }
//
//            })
        RetrofitHelper.getApiService().getBanner(map)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observe<BannerResult>(contexts!!) {
                override fun onSuccess(t: CommonResult<BannerResult>) {
                    t as BannerResult
                    if (t.data!= null && t.data.isNotEmpty()) {
                        mView!!.showImg(t.data[0].img_url)
                    }
                    mView!!.showCharacter(t.toString())
                }

                override fun onFailure() {
                    Log.e("", "")
                }

            })
    }

}