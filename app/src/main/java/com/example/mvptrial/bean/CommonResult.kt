package com.example.mvptrial.bean

/**
 *Time:2019/5/30
 *Author:zyh
 *Description:
 */
open class CommonResult<T>{
    private var message: String? = null
    private var status: String? = null
    private var t: T? = null

    fun getT(): T? {
        return t
    }
    fun setT(t: T){
        this.t = t
    }
    fun getMessage(): String? {
        return message
    }

    fun setMessage(message: String) {
        this.message = message
    }

    fun getStatus(): String {
        return if (status == null) {
            "数据格式错误"
        } else status!!
    }

    fun setStatus(status: String) {
        this.status = status
    }
}