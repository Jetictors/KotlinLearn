package com.kotlin.leran.design.factory.method.demo1

/**
 * Desc           :  抽象产品角色
 * Author         :  Jetictors
 * Time           :  2019-12-18  15:00
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
interface IProduce{

    /**
     *  具体产品的公有逻辑
     */
    fun showTest(name : String)

}