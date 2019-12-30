package com.kotlin.leran.design.policy.demo

/**
 * Desc           :  汽车票策略
 * Author         :  Jetictors
 * Time           :  2019-12-16  11:42
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class GaoTieTicket : IBuyTicket{

    override fun getTicketMoney(travel : String, price : Double): Double {
        println("行程为 ： $travel \n 票价为 ： ${price * 2.5}")
        return price * 2.5
    }

    override fun getType(): Int {
        return IBuyTicket.TYPE_GAO_TIE
    }

}