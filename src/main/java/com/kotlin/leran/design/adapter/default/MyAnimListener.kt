package com.kotlin.leran.design.adapter.default

/**
 * Desc           :
 * Author         :  Jetictors
 * Time           :  2019-12-30  12:11
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-
 */
class MyAnimListener : AnimListener(){

    override fun onStart() {
        println("my anim is start")
    }

    override fun onEnd() {
        println("my anim is end")
    }

}