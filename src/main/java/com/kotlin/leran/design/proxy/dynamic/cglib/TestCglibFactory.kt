package com.kotlin.leran.design.proxy.dynamic.cglib

import net.sf.cglib.proxy.Enhancer
import net.sf.cglib.proxy.MethodInterceptor
import net.sf.cglib.proxy.MethodProxy
import java.lang.reflect.Method

/**
 * Desc           :  cglib动态代理
 * Author         :  Jetictors
 * Time           :  2019-12-13  15:56
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */

class TestCglibFactory(private val target: Car) : MethodInterceptor{

    fun creator() : Car{
        val enhancer = Enhancer()
        // 设置需要代理的对象 :  目标类(target) , 也是父类
        enhancer.setSuperclass(target.javaClass)
        // 设置代理对象， 这是回调设计模式:  设置回调接口对象 :
        enhancer.setCallback(this)
        return enhancer.create() as Car
    }

    override fun intercept(proxy: Any?, method: Method?, args: Array<out Any>?, p3: MethodProxy?): Any? {

        if (null == args || args.isEmpty()) return null

        doBefore()
        val any = method?.invoke(target, args[0], args[1])
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