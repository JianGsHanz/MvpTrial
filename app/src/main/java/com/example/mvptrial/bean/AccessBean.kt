package com.example.mvptrial.bean

data class AccessBean(
    val `data`: List<AccessData>,
    val errorCode: Int,
    val errorMsg: String
) :CommonResult<AccessBean>()
data class AccessData(
    val desc: String,
    val id: Int,
    val imagePath: String,
    val isVisible: Int,
    val order: Int,
    val title: String,
    val type: Int,
    val url: String
)