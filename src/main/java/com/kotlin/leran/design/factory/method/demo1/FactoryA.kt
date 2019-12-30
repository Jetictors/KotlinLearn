package com.kotlin.leran.design.factory.method.demo1

/**
 * Desc           :  具体工厂角色A
 * Author         :  Jetictors
 * Time           :  2019-12-18  15:00
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class FactoryA : IFactory{

    override fun createProduce() : IProduce{
        return ProduceA()
    }

}