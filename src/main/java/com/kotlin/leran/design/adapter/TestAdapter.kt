package com.kotlin.leran.design.adapter

import com.kotlin.leran.design.adapter.cls.ClsAdapter
import com.kotlin.leran.design.adapter.default.MyAnimListener
import com.kotlin.leran.design.adapter.obj.ObjAdaptee
import com.kotlin.leran.design.adapter.obj.ObjAdapter

/**
 * Desc           :  适配器模式测试类
 * Author         :  Jetictors
 * Time           :  2019-12-30  11:46
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class TestAdapter {

    fun test(){
        testClsAdapter()
        testDefaultAdapter()
        testObjAdapter()
    }

    /**
     * 缺省类适配器模式
     */
    private fun testClsAdapter(){
        val target = ClsAdapter()
        println(target.operatorFirst())
        println(target.operatorSecond())
    }

    /**
     * 测试缺省/模式的适配器模式
     */
    private fun testDefaultAdapter(){
        val listener = MyAnimListener()
        listener.onStart()
        listener.onResume()
        listener.onPause()
        listener.onEnd()
        listener.onRepeat()
    }

    /**
     * 测试对象类适配器模式
     */
    private fun testObjAdapter(){
        val adaptee = ObjAdaptee()
        val target = ObjAdapter(adaptee)
        println(target.operatorFirst())
        println(target.operatorSecond())
    }

}
