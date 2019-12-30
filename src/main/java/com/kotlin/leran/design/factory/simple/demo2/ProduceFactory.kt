package com.kotlin.leran.design.factory.simple.demo2

/**
 * Desc           :  省略了抽象角色的工厂类
 * Author         :  Jetictors
 * Time           :  2019-12-17  17:31
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */

class ProduceFactory{

    fun createProduce() : Produce {
        return Produce("first produce")
    }

}