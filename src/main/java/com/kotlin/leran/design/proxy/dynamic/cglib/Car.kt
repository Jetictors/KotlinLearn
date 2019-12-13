package com.kotlin.leran.design.proxy.dynamic.cglib

/**
 * Desc           :  cglib动态代理
 * Author         :  Jetictors
 * Time           :  2019-12-13  15:46
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
open class Car{

    fun buyCarTicket(travel : String, price : Double){
        println("我买汽车票, 行程为： ${travel}, 价格是：${price}元")
        println("买票中")
        println("...")
    }

}