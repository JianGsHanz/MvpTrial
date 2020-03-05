package com.example.mvptrial.ui.main

import android.app.Activity
import android.util.Log
import com.example.mvptrial.base.BasePresenter
import com.example.mvptrial.bean.AccessBean
import com.example.mvptrial.bean.CommonResult
import com.example.mvptrial.net.AppApis
import com.example.mvptrial.net.Observe
import com.example.mvptrial.net.RxUtil
import javax.inject.Inject

/**
 *Time:2019/5/20
 *Author:zyh
 *Description:
 */
class MainPresenter : BasePresenter<MainContract.view>, MainContract.presenter {

    var contexts : Activity
    var appApis: AppApis
    @Inject
    constructor(appApis: AppApis,contexts : Activity){
        this.contexts = contexts
        this.appApis = appApis
    }

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
        /*RetrofitHelper.getApiService().getBanner(map)
            .compose(RxUtil.rxSchedulerHelper(contexts!!))
            .subscribe(object : Observe<BannerResult>(contexts!!) {
                override fun onSuccess(t: CommonResult<BannerResult>) {
                    t as BannerResult
                    if (t.data!= null && t.data.isNotEmpty()) {
                        mView!!.showImg(t.data[0].img_url)
                    }
                    mView!!.showCharacter(t.toString())
                }

                override fun onFailure(e: Throwable) {
                    Log.e("onFailure", "${e.message}")
                }

            })*/
        appApis.getAccess()
            .compose(RxUtil.rxSchedulerHelper())
            .subscribe(object : Observe<AccessBean>(contexts) {
                override fun onSuccess(t: CommonResult<AccessBean>) {
                    val bean = t as AccessBean
//                    if (t.data!= null && t.data.isNotEmpty()) {
//                        mView!!.showImg(t.data[0].img_url)
//                    }
                    mView!!.showCharacter(t.toString())
                    mView!!.showImg(bean.data[0].imagePath)
                }

                override fun onFailure(e: Throwable) {
                    Log.e("onFailure", "${e.message}")
                }

            })

    }

}