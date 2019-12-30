package com.kotlin.leran.design.factory.simple.demo2

/**
 * Desc           :  具体产品（当只有一个具体产品是，抽象角色可省略）
 * Author         :  Jetictors
 * Time           :  2019-12-17  17:28
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
data class Produce(var name : String){

    fun update(){
        println("更新产品 $name")
    }

}

interface IApple{



}

class OneApple : IApple {

}