package com.kotlin.leran.design.factory.simple.demo1

/**
 * Desc           :  抽象角色
 * Author         :  Jetictors
 * Time           :  2019-12-17  16:23
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */

interface IFruit{

    /**
     * 生长
     */
    fun grow()

    /**
     * 种植
     */
    fun plant()

    /**
     * 收获
     */
    fun harvest()

    /**
     * 价格
     */
    var price : Double

}