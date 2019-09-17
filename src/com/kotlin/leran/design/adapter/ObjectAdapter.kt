package com.kotlin.leran.design.adapter

/**
 * Desc           :  对象适配器模式
 * Author         :  Jetictors
 * Time           :  2019/9/17 10:56
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */

interface ObjTarget{

    fun operatorFirst() : String

    fun operatorSecond() : String

}

class ObjAdaptee{

    fun operatorFirst() : String{
        return "object first method"
    }

}

class ObjAdapter(private var adaptee: ObjAdaptee) : ObjTarget{

    override fun operatorFirst(): String {
       return adaptee.operatorFirst().plus("adapter success!")
    }

    override fun operatorSecond(): String {
        return "object second method"
    }
}

class ObjectAdapter{

    fun test(){
        val adaptee = ObjAdaptee()
        val target = ObjAdapter(adaptee)
        println(target.operatorFirst())
        println(target.operatorSecond())
    }

}
