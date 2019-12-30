package com.kotlin.leran.design.proxy

import com.kotlin.leran.design.proxy.dynamic.cglib.Car
import com.kotlin.leran.design.proxy.dynamic.cglib.TestCglibFactory
import com.kotlin.leran.design.proxy.dynamic.jdk.*
import com.kotlin.leran.design.proxy.statics.demo1.Driver
import com.kotlin.leran.design.proxy.statics.demo1.FirstDriver
import com.kotlin.leran.design.proxy.statics.demo1.MoneyProxy
import com.kotlin.leran.design.proxy.statics.demo2.PlaneProxy
import com.kotlin.leran.design.proxy.statics.demo2.RailwayProxy
import com.kotlin.leran.design.proxy.statics.demo2.User
import java.lang.reflect.Proxy

/**
 * Desc           :  测试代理模式
 * Author         :  Jetictors
 * Time           :  2019-12-27  17:04
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class TestProxy{

    fun test(){
        testStaticsProxy()
        testJdkDynamicProxy()
        testCglibDynamicProxy()
    }

    /**
     * 测试静态代理
     */
    private fun testStaticsProxy(){
        val user = User()
        val planeProxy = PlaneProxy(user)
        planeProxy.buyTicket("深圳-重庆", 783.56)

        val railwayProxy = RailwayProxy(user)
        railwayProxy.buyTicket("广州南-重庆西", 428.23)

        val driver = Driver()
        val driverProxy2 = MoneyProxy(driver)
        driverProxy2.giveMoney(5,13)

        val firstDriver = FirstDriver()
        firstDriver.giveMoney(7,12)
    }

    /**
     * 测试动态代理
     */
    private fun testJdkDynamicProxy(){
        val railway = Railway()
        var handler = ProxyHandler(railway)
        val railwayProxy = Proxy.newProxyInstance(railway.javaClass.classLoader,
                railway.javaClass.interfaces, handler) as IDynamicTicket
        railwayProxy.buyTicket("广州南-重庆西", 428.34)

        val plane = Plane()
        handler = ProxyHandler(plane)
        val planeProxy = Proxy.newProxyInstance(plane.javaClass.classLoader,
                plane.javaClass.interfaces, handler) as IDynamicTicket
        planeProxy.buyTicket("深圳-重庆", 1028.34)

        val boat = Boat()
        handler = ProxyHandler(boat)
        val boatProxy = Proxy.newProxyInstance(boat.javaClass.classLoader,
                boat.javaClass.interfaces, handler) as IDynamicTicket
        boatProxy.buyTicket("深圳-香港", 167.34)
    }

    /**
     * 测试动态代理
     */
    private fun testCglibDynamicProxy(){
        val car = Car()
        val carProxy = TestCglibFactory(car).creator()
        carProxy.buyCarTicket("深圳-广州", 137.5)
    }

}