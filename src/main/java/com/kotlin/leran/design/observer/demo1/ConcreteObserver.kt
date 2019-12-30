package com.kotlin.leran.design.observer.demo1

/**
 * Desc           :  具体观察者
 * Author         :  Jetictors
 * Time           :  2019-12-16  15:47
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class ConcreteObserver(val name : String) : Observer{

    override fun response() {
        println("$name 收到了通知")
    }

}