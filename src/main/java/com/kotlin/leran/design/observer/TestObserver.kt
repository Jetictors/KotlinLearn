package com.kotlin.leran.design.observer

import com.kotlin.leran.design.observer.demo1.ConcreteObserver
import com.kotlin.leran.design.observer.demo1.ConcreteSubject

/**
 * Desc           :  测试观察者模式
 * Author         :  Jetictors
 * Time           :  2019-12-27  11:11
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */

class TestObserver{

    fun test(){
        testObserverDemo1()
        testObserverDemo2()
    }

    /**
     * 测试观察者概念demo
     */
    private fun testObserverDemo1(){
        val subject = ConcreteSubject()
        val observerFirst = ConcreteObserver("观察者对象1")
        val observerSecond = ConcreteObserver("观察者对象2")

        subject.attach(observerFirst)
        subject.attach(observerSecond)
        subject.notifyObserver()

        subject.detach(observerFirst)
        subject.notifyObserver()
    }

    /**
     * 测试观察者模式实例
     */
    private fun testObserverDemo2(){}

}