package com.kotlin.leran.design.proxy.statics.demo1

/**
 * Desc           :  委托对象1
 * Author         :  Jetictors
 * Time           :  2019-12-12  18:18
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.0
 */

class FirstDriver : Driver(){

    override fun giveMoney(count : Int, price : Int) {
        doBefore()

        println("这趟车坐了${count}个人, 每个人${price}元钱")
        val result = count * price
        println("收费成功，共收得车费${result}元")

        doAfter()
    }

    private fun doBefore(){
        println("开门上车，向司机拿表")
    }

    private fun doAfter(){
        println("填单，关门走人")
    }

}

