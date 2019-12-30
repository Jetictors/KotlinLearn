package com.kotlin.leran.design.factory.method.demo2

/**
 * Desc           :  具体产品角色（小米手机）
 * Author         :  Jetictors
 * Time           :  2019-12-27  15:17
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class XiaoMiPhone(override val type: String, override val time: String) : IChinaPhone{

    override fun aboutSelf() {
        println("I`m XiaoMi Phone $type")
    }

    override fun createTime() {
        println(type)
    }

}