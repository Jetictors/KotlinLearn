package com.kotlin.leran.design.factory.method.demo2

/**
 * Desc           :  抽象角色
 * Author         :  Jetictors
 * Time           :  2019-12-18  15:00
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
interface IPhone{

    /**
     * 阐述自己
     */
    fun aboutSelf()

    /**
     * 生产日期
     */
    fun createTime()

    /**
     * 生产地
     */
    fun createAddress()

}
