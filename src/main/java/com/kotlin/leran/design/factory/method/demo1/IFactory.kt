package com.kotlin.leran.design.factory.method.demo1

/**
 * Desc           :  抽象工厂角色
 * Author         :  Jetictors
 * Time           :  2019-12-18  15:00
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
interface IFactory{

    /**
     *  创建产品对象
     */
    fun createProduce() : IProduce

}