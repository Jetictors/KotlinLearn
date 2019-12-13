package com.kotlin.leran.design.proxy.statics.demo1

/**
 * Desc           :  代理对象
 * Author         :  Jetictors
 * Time           :  2019-12-12  18:13
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class MoneyProxy(private val proxy : IStaticMoney) : IStaticMoney{

    override fun giveMoney(count : Int, price : Int) {
        doBefore()
        proxy.giveMoney(count, price)
        doAfter()
    }

    private fun doBefore(){
        println("开门上车，向司机拿表")
    }

    private fun doAfter(){
        println("填单，关门走人")
    }

}