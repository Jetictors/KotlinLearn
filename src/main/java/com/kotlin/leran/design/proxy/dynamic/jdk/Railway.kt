package com.kotlin.leran.design.proxy.dynamic.jdk

/**
 * Desc           :  买火车票
 * Author         :  Jetictors
 * Time           :  2019-12-13  11:24
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class Railway : IDynamicTicket{

    override fun buyTicket(travel: String, price: Double) {
        println("我买火车票, 行程为： ${travel}, 价格是：${price}元")
        println("买票中")
        println("...")
    }

}
