package com.kotlin.leran.design.policy

import com.kotlin.leran.design.policy.demo.CarTicket
import com.kotlin.leran.design.policy.demo.GaoTieTicket
import com.kotlin.leran.design.policy.demo.IBuyTicket
import com.kotlin.leran.design.policy.demo.PlaneTicket

/**
 * Desc           :  测试策略模式
 * Author         :  Jetictors
 * Time           :  2019-12-30  11:36
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class TestPolicy{

    fun test(type : Int){
        testPolicyDemo(type)
    }

    /**
     * 测试策略类
     */
    private fun testPolicyDemo(type : Int){
        val ticket = when(type){
            IBuyTicket.TYPE_PLANE -> PlaneTicket()
            IBuyTicket.TYPE_GAO_TIE -> GaoTieTicket()
            IBuyTicket.TYPE_CAR -> CarTicket()
            else -> null
        }

        ticket?.getTicketMoney("深圳-广州", 137.5)
    }

}