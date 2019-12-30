package com.kotlin.leran.design.policy.demo

/**
 * Desc           :  策略模式接口
 * Author         :  Jetictors
 * Time           :  2019-12-16  11:27
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
interface IBuyTicket{

    companion object{

        // 汽车票
        const val TYPE_CAR = 0

        // 高铁票
        const val TYPE_GAO_TIE = 1

        // 动车票
        const val TYPE_DONG_CHE = 2

        // 火车票
        const val TYPE_RAILWAY = 3

        // 飞机票
        const val TYPE_PLANE = 4

        // 船票
        const val TYPE_BOAT = 5

    }

    /**
     * 获取票价
     * [travel]  行程
     */
    fun getTicketMoney(travel : String, price : Double) : Double

    /**
     * 获取车票类型
     */
    fun getType() : Int
}