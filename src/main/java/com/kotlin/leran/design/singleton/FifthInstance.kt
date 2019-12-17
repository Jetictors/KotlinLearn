package com.kotlin.leran.design.singleton

/**
 * Desc           :  单列模式五（懒汉式 + 双重锁 + volatile）
 * Author         :  Jetictors
 * Time           :  2019-12-16  18:06
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class FifthInstance private constructor(val name: String){

    companion object{

        @Volatile private var sInstance : FifthInstance? = null

        fun getInstance(name : String) = sInstance ?: synchronized(this){
            sInstance ?: FifthInstance(name).also { sInstance = it }
        }

    }

    /**
     * 测试函数
     */
    fun testInstance(){
        println("${javaClass.simpleName}初始化成功，并调用了测试函数")
    }

}