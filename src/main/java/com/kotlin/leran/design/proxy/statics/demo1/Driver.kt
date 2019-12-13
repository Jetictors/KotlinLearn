package com.kotlin.leran.design.proxy.statics.demo1

/**
 * Desc           :  委托对象
 * Author         :  Jetictors
 * Time           :  2019-12-12  18:18
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.0
 */

open class Driver : IStaticMoney{

    override fun giveMoney(count : Int, price : Int) {
        println("这趟车坐了${count}个人, 每个人${price}元钱")
        val result = count * price
        println("收费成功，共收得车费${result}元")
    }

}

