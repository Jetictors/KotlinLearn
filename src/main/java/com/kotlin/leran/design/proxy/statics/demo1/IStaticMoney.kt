package com.kotlin.leran.design.proxy.statics.demo1

/**
 * Desc           :  静态代理2
 * Author         :  Jetictors
 * Time           :  2019-12-12  17:32
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
interface IStaticMoney {

    /**
     *  收钱
     *  [count] 人数
     *  [price] 单价
     */
    fun giveMoney(count : Int, price : Int)

}