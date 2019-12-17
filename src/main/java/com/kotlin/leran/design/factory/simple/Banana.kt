package com.kotlin.leran.design.factory.simple

/**
 * Desc           :  具体角色
 * Author         :  Jetictors
 * Time           :  2019-12-17  16:28
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class Banana(override var price: Double) : IFruit{

    override fun grow() {
        println("grow banana...")
    }

    override fun plant() {
        println("plant banana...")
    }

    override fun harvest() {
        println("harvest banana ...")
        println("I`m banana, price : $price")
    }

}