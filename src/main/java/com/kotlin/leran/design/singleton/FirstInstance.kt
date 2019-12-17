package com.kotlin.leran.design.singleton

/**
 * Desc           :  单列模式一（懒汉模式）
 * Author         :  Jetictors
 * Time           :  2019-12-16  18:06
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class FirstInstance private constructor(){

    companion object{

        // 方式一： 直接使用公有变量的形式
        /*
            val sInstance : FirstInstance? = null
            get() {
                if (null == field){
                    return FirstInstance()
                }
                return field
            }
        */

        // 方式二：使用私有变量+函数的形式
        private var sInstance : FirstInstance? = null

        fun getInstance() : FirstInstance?{
            if (null == sInstance){
                sInstance = FirstInstance()
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