package com.example.mvptrial.bean

/**
 *Time:2019/5/30
 *Author:zyh
 *Description:
 */
data class BannerResult(
    val data : List<Data>,
    val code: Int
) : CommonResult<BannerResult>()

data class Data(
    val ad_address_url: String,
    val ad_others_url: String,
    val ad_type: Any,
    val ad_user: String,
    val create_date: Long,
    val end_date: Long,
    val id: Int,
    val img_url: String,
    val is_link: Int,
    val is_use: String,
    val max_img_url: String,
    val name: String,
    val platformrId: String,
    val pro_id: String,
    val recommendations: Any,
    val remarks: String,
    val show_duration: String,
    val sortId: Int,
    val start_date: Long,
    val update_date: Long
)