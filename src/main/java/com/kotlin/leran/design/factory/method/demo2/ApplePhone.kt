package com.kotlin.leran.design.factory.method.demo2

/**
 * Desc           :  具体产品角色（苹果手机）
 * Author         :  Jetictors
 * Time           :  2019-12-27  15:17
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class ApplePhone(val type : String, val time : String) : IPhone{

    override fun aboutSelf() {
        println("I`m Apple Phone $type")
    }

    override fun createTime() {
        println(time)
    }

    override fun createAddress() {
        println("made in America")
    }

}