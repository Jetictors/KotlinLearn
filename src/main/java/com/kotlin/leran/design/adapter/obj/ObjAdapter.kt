package com.kotlin.leran.design.adapter.obj

/**
 * Desc           :  对象适配器 适配器角色
 * Author         :  Jetictors
 * Time           :  2019-12-30  11:53
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-
 */
class ObjAdapter(private var adaptee: ObjAdaptee) : ObjTarget{

    override fun operatorFirst(): String {
        return adaptee.operatorFirst().plus("adapter success!")
    }

    override fun operatorSecond(): String {
        return "object second method"
    }
}