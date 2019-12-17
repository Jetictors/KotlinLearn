package com.kotlin.leran.design.factory.simple

/**
 * Desc           :  普通工厂模式
 * Author         :  Jetictors
 * Time           :  2019-12-17  16:41
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class FirstFruitFactory{

    /**
     * 根据类型创建
     */
    fun createFactory(type : String) : IFruit?{
        return when(type){
            "apple" -> Apple("red", 12.8)
            "banana" -> Banana(8.8)
            "grape" -> Grape(false, 15.98)
            else -> null
        }
    }

}
