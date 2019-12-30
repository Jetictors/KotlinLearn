package com.kotlin.leran.design.adapter.default

/**
 * Desc           :
 * Author         :  Jetictors
 * Time           :  2019-12-30  12:11
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-
 */
open class AnimListener : Listener{
    override fun onStart() {
        println("anim start")
    }

    override fun onResume() {
        println("anim resume")
    }

    override fun onPause() {
        println("anim pause")
    }

    override fun onEnd() {
        println("anim end")
    }

    override fun onRepeat() {
        println("anim repeat")
    }

}