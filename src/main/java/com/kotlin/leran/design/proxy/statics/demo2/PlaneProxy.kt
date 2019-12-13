package com.kotlin.leran.design.proxy.statics.demo2

/**
 * Desc           :  代理类B（买飞机票）
 * Author         :  Jetictors
 * Time           :  2019-12-12  16:02
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class PlaneProxy(private val proxy : IStaticTicket) : IStaticTicket {

    override fun buyTicket(travel : String, price : Double) {
        doBefore()
        proxy.buyTicket(travel, price)
        doAfter()
    }

    private fun doBefore(){
        println("去机票代售点")
        println("开始身份验证")
        println("...")
    }

    private fun doAfter(){
        println("确认班次、座位等信息")
        println("付款")
        println("...")
    }

}