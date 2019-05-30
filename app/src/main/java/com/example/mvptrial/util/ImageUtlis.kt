package com.example.mvptrial.util

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions
import java.io.File

object ImageUtlis {

    /**
     * 默认加载方式
     *
     * @param context
     * @param url
     * @param imageView
     */
    fun loadImage(context: Context, url: String, imageView: ImageView) {
        val requestOptions = RequestOptions()
            .priority(Priority.HIGH)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .dontAnimate()

        Glide.with(context)
            .load(url)
            .apply(requestOptions)
            .transition(DrawableTransitionOptions.withCrossFade())
            .into(imageView)
    }

    /**
     * 加载圆形图片
     *
     * @param context
     * @param url
     * @param imageView
     */
    fun loadCircleImage(context: Context, url: String, imageView: ImageView) {
        val requestOptions = RequestOptions()
            .priority(Priority.HIGH)
            .dontAnimate()
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .transform(CircleCrop())

        Glide.with(context)
            .load(url)
            .apply(requestOptions)
            .transition(DrawableTransitionOptions.withCrossFade())
            .into(imageView)
    }

    /**
     * 加载圆角图片
     * @param context
     * @param url
     * @param imageView
     * @param radius 圆角大小
     */
    fun loadRoundImage(context: Context, url: String, imageView: ImageView, radius: Int) {
        val requestOptions = RequestOptions()
            .priority(Priority.HIGH)
            .dontAnimate()
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .transforms(CenterCrop(), RoundedCorners(radius))

        Glide.with(context)
            .load(url)
            .apply(requestOptions)
            .transition(DrawableTransitionOptions.withCrossFade())
            .into(imageView)
    }

    /**
     * 加载图片指定大小
     *
     * @param context
     * @param url
     * @param imageView
     * @param width
     * @param height
     */
    fun loadSizeImage(context: Context, url: String, imageView: ImageView, width: Int, height: Int) {
        val requestOptions = RequestOptions()
            .priority(Priority.HIGH)
            .override(width, height)
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE)

        Glide.with(context)
            .load(url)
            .apply(requestOptions)
            .transition(DrawableTransitionOptions.withCrossFade())
            .into(imageView)
    }

    /**
     * 加载本地图片文件
     *
     * @param context
     * @param file
     * @param imageView
     */
    fun loadFileImage(context: Context, file: File, imageView: ImageView) {
        val requestOptions = RequestOptions()
            .priority(Priority.HIGH)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()

        Glide.with(context)
            .load(file)
            .apply(requestOptions)
            .into(imageView)
    }

    /**
     * 加载高斯模糊
     *
     * @param context
     * @param url
     * @param imageView
     * @param radius      模糊级数 最大25
     */
    //    public static void loadBlurImage(Context context, String url, ImageView imageView, int radius) {
    //        RequestOptions requestOptions = new RequestOptions()
    //                .override(300)
    //                .transforms(new BlurTransformation(radius));
    //
    //        Glide.with(context)
    //                .load(url)
    //                .apply(requestOptions)
    //                .transition(DrawableTransitionOptions.withCrossFade())
    //                .into(imageView);
    //    }

    /**
     * 加载gif图
     * @param context
     * @param url
     * @param imageView
     */
    fun loadGifImage(context: Context, url: String, imageView: ImageView) {
        Glide.with(context)
            .load(url)
            .into(imageView)
    }
}
