package com.kotlin.leran.design.observer.demo1

/**
 * Desc           :  具体主题（被观察者）
 * Author         :  Jetictors
 * Time           :  2019-12-16  15:39
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class ConcreteSubject : Subject{

    private val mObserverList = mutableListOf<Observer>()

    override fun attach(observer: Observer) {
        mObserverList.add(observer)
    }

    override fun detach(observer: Observer) {
        mObserverList.remove(observer)
    }

    override fun notifyObserver() {
        for (observer in mObserverList) {
            observer.response()
        }
    }
}