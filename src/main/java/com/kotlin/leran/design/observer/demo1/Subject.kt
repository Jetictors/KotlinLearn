package com.kotlin.leran.design.observer.demo1

/**
 * Desc           :  抽象主题(被观察者)
 * Author         :  Jetictors
 * Time           :  2019-12-16  15:32
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
interface Subject{

    /**
     * 添加观察者
     */
    fun attach(observer: Observer)

    /**
     * 移除观察者
     */
    fun detach(observer: Observer)

    /**
     * 通知观察者
     */
    fun notifyObserver()

}