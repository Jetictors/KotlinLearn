package com.kotlin.leran.design.factory.simple.demo3

/**
 * Desc           :  把抽象角色、具体角色、工厂类合并再一起，
 * Author         :  Jetictors
 * Time           :  2019-12-17  17:31
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */

class ConcreteProduce{

    companion object{
        fun createProduce() : ConcreteProduce {
            return ConcreteProduce()
        }
    }

    fun show(){}

}
