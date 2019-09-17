package com.kotlin.leran.design.adapter

/**
 * Desc           :  类适配器模式
 * Author         :  Jetictors
 * Time           :  2019/9/17 10:26
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */


/**
 * 目标角色
 */
interface ClsTarget{

    /**
     * 操作一
     */
    fun operatorFirst() : String

    /**
     * 操作二
     */
    fun operatorSecond() : String

}

/**
 * 源角色
 */
open class ClsAdaptee{

    open fun operatorFirst() : String{
        return "class first method"
    }

}

/**
 * 适配器角色
 */
class ClsAdapter : ClsAdaptee(), ClsTarget{

    override fun operatorSecond(): String {
       return "class second method"
    }

    override fun operatorFirst(): String {
        return super.operatorFirst().plus("adapter success !")
    }

}


class ClassAdapter{

    fun test(){
        val target = ClsAdapter()
        println(target.operatorFirst())
        println(target.operatorSecond())
    }

}
