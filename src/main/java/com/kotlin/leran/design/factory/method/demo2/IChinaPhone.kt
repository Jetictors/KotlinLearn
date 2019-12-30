package com.kotlin.leran.design.factory.method.demo2

/**
 * Desc           :  抽象产品角色（中国手机）
 * Author         :  Jetictors
 * Time           :  2019-12-27  15:37
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
interface IChinaPhone : IPhone{

    /**
     * 类型
     */
    val type : String

    /**
     * 生产时间
     */
    val time : String

    override fun createAddress() {
        println("Made in China")
    }

}