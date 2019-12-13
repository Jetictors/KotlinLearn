package com.kotlin.leran.design.proxy.statics.demo2

/**
 * Desc           :  代理类A（买火车票）
 * Author         :  Jetictors
 * Time           :  2019-12-12  16:02
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class RailwayProxy(private val proxy : IStaticTicket) : IStaticTicket {

    override fun buyTicket(travel : String, price : Double) {
        doBefore()
        proxy.buyTicket(travel, price)
        doAfter()
    }

    private fun doBefore(){
        println("去火车票代售点")
        println("...")
    }

    private fun doAfter(){
        println("确认班次、座位等信息")
        println("付款")
        println("...")
    }

}