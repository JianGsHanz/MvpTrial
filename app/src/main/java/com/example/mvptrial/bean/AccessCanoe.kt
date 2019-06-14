package com.example.mvptrial.bean

/**
 *Time:2019/6/14
 *Author:zyh
 *Description:
 */
data class AccessCanoe (val data : List<Datas>): CommonResult<AccessCanoe>()
data class Datas(val appId :String,val source :String,val appStatus :String)