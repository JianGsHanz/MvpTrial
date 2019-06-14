package com.example.mvptrial.net

import com.example.mvptrial.bean.AccessCanoe
import com.example.mvptrial.bean.BannerResult
import com.example.mvptrial.bean.BannerResults
import io.reactivex.Observable
import retrofit2.http.FieldMap
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

/**
 *Time:2019/5/30
 *Author:zyh
 *Description:接口方法
 */
interface AppApis{

    @FormUrlEncoded
    @POST("market/adviertisement/getAdviertisement")
    fun getBanner(@FieldMap map: Map<String,String>) : Observable<BannerResult>

    @GET("banner/json")
    fun getAccess() : Observable<BannerResults>
}