package com.example.mvptrial

import android.app.Activity
import android.widget.Toast

/**
 *Time:2019/8/8
 *Author:zyh
 *Description:扩展函数
 */
fun Activity.toast(msg: String) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}
