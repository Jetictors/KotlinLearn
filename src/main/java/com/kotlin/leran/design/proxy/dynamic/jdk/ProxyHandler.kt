package com.kotlin.leran.design.proxy.dynamic.jdk

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

/**
 * Desc           :  动态代理
 * Author         :  Jetictors
 * Time           :  2019-12-13  11:08
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class ProxyHandler(private val target : IDynamicTicket) : InvocationHandler{

    /**
     * [proxy]  代理对象
     * [method] 目标函数
     * [args]   目标函数的参数
     */
    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any? {

        if (args == null) return null

        doBefore()
        val any =  method?.invoke(target, args[0], args[1])
        doAfter()

        return any
    }

    private fun doBefore(){
        println("去代售点")
    }

    private fun doAfter(){
        println("买票成功了")
    }

}
