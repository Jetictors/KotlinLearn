package com.kotlin.leran.design.factory.method.demo2

/**
 * Desc           :  抽象工厂
 * Author         :  Jetictors
 * Time           :  2019-12-18  11:57
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
interface IPhoneFactory{

    /**
     * 生产手机
     * [type]  手机型号
     * [time]  生产日期
     */
    fun createPhone(type : String, time : String) : IPhone

}
