package com.kotlin.leran.design.adapter

/**
 * Desc           :  缺省/默认的适配器模式
 * Author         :  Jetictors
 * Time           :  2019/9/17 11:25
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
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

class MyAnimListener : AnimListener(){

    override fun onStart() {
        println("my anim is start")
    }

    override fun onEnd() {
        println("my anim is end")
    }

}

class DefaultAdapter{

    fun test(){
        val listener = MyAnimListener()
        listener.onStart()
        listener.onResume()
        listener.onPause()
        listener.onEnd()
        listener.onRepeat()
    }

}
