package com.kotlin.leran.design.factory.method.demo1

/**
 * Desc           :  具体产品角色A
 * Author         :  Jetictors
 * Time           :  2019-12-18  15:00
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class ProduceA : IProduce{

    /**
     *  具体产品的公有逻辑
     */
    override fun showTest(name : String){
        println("create produce A is success !  name = $name")
    }

}