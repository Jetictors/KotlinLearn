package com.kotlin.leran.design.singleton

/**
 * Desc           :  单列模式三（懒汉模式-同步））
 * Author         :  Jetictors
 * Time           :  2019-12-16  18:06
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class ThirdInstance private constructor(){

    companion object{
        private var sInstance : ThirdInstance? = null

        @Synchronized
        fun getInstance() : ThirdInstance?{
            if (null == sInstance){
                sInstance = ThirdInstance()
            }
            return sInstance
        }
    }

    /**
     * 测试函数
     */
    fun testInstance(){
        println("${javaClass.simpleName}初始化成功，并调用了测试函数")
    }

}