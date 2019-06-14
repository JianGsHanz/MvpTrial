package com.example.mvptrial.net

import android.app.Dialog
import android.content.Context
import android.graphics.drawable.AnimationDrawable
import android.view.LayoutInflater
import android.widget.ImageView
import com.example.mvptrial.R
import com.example.mvptrial.bean.CommonResult
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

/**
 *Time:2019/5/30
 *Author:zyh
 *Description:
 */
abstract class Observe<T> : Observer<CommonResult<T>> {
    private var context : Context? = null
    private var dialog : Dialog? = null
    private lateinit var anim : AnimationDrawable
    constructor()
    constructor(context: Context){
        this.context = context
    }

    override fun onComplete() {
    }

    override fun onSubscribe(d: Disposable) {
        showDialog()
    }

    override fun onNext(t: CommonResult<T>) {
        dismissDialog()
        if (t.getStatus() == "0")
        onSuccess(t)
    }

    override fun onError(e: Throwable) {
        dismissDialog()
        onFailure(e)
    }


    private fun showDialog(){
        val view = LayoutInflater.from(context)
            .inflate(R.layout.dialog_view, null)
        val loading = view.findViewById<ImageView>(R.id.dialog_loading)
        anim = loading.drawable as AnimationDrawable
        anim.start()
        if (dialog == null){
            dialog = Dialog(context,R.style.LoadDialog)
            dialog!!.setContentView(view)
            dialog!!.show()
        }

    }
    private fun dismissDialog(){
        if (dialog != null && dialog!!.isShowing){
            dialog!!.dismiss()
            anim.stop()
        }
    }
    abstract fun onSuccess(t: CommonResult<T>)
    abstract fun onFailure(e: Throwable)
}