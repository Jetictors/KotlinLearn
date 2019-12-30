package com.kotlin.leran.design.adapter.default

/**
 * Desc           :
 * Author         :  Jetictors
 * Time           :  2019-12-30  12:10
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-
 */
interface Listener{

    /**
     * 开始
     */
    fun onStart()

    /**
     * 正在运行
     */
    fun onResume()

    /**
     *  暂停
     */
    fun onPause()

    /**
     * 结束
     */
    fun onEnd()

    /**
     * 重复
     */
    fun onRepeat()
}