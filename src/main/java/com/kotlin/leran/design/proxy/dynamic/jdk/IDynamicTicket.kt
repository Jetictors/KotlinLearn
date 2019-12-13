package com.kotlin.leran.design.proxy.dynamic.jdk

/**
 * Desc           :  动态代理接口
 * Author         :  Jetictors
 * Time           :  2019-12-12  15:42
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
interface IDynamicTicket {

    /**
     * 买票过程
     * [travel] 行程
     * [price]  价格
     */
    fun buyTicket(travel : String, price : Double)

}