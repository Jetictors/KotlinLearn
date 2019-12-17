package com.kotlin.leran.design.factory.simple

/**
 * Desc           :  具体角色
 * Author         :  Jetictors
 * Time           :  2019-12-17  16:28
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class Apple(private val color : String, override var price: Double) : IFruit{

    override fun grow() {
        println("grow apple...")
    }

    override fun plant() {
        println("plant apple...")
    }

    override fun harvest() {
        println("harvest apple ...")
        println("I`m apple, color : $color \t price : $price")
    }

}