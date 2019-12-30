package com.kotlin.leran.design.factory.simple.demo1

/**
 * Desc           :  具体角色
 * Author         :  Jetictors
 * Time           :  2019-12-17  16:28
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class Grape(private val seed : Boolean, override var price: Double) : IFruit {

    override fun grow() {
        println("grow grape...")
    }

    override fun plant() {
        println("plant grape...")
    }

    override fun harvest() {
        println("harvest grape ...")
        println("I`m grape, seed : $seed \t price : $price")
    }

}