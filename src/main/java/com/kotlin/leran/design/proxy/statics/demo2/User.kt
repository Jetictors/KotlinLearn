package com.kotlin.leran.design.proxy.statics.demo2

/**
 * Desc           :  委托类A
 * Author         :  Jetictors
 * Time           :  2019-12-12  16:04
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
open class User : IStaticTicket {

    /**
     * 具体的业务逻辑
     */
    override fun buyTicket(travel : String, price : Double) {
        println("买票中")
        println("行程为：${travel}, 价格为：${price}元")
        println("...")
    }

}