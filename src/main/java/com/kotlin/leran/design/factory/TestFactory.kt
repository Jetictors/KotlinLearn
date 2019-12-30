package com.kotlin.leran.design.factory

import com.kotlin.leran.design.factory.method.demo1.FactoryA
import com.kotlin.leran.design.factory.method.demo1.FactoryB
import com.kotlin.leran.design.factory.method.demo2.AmericaFactory
import com.kotlin.leran.design.factory.method.demo2.HuaweiFactory
import com.kotlin.leran.design.factory.method.demo2.XiaoMiFactory
import com.kotlin.leran.design.factory.simple.demo1.FirstFruitFactory
import com.kotlin.leran.design.factory.simple.demo1.SecondFruitFactory
import com.kotlin.leran.design.factory.simple.demo1.ThirdFruitFactory
import com.kotlin.leran.design.factory.simple.demo2.ProduceFactory
import com.kotlin.leran.design.factory.simple.demo3.ConcreteProduce

/**
 * Desc           :  测试工厂模式
 * Author         :  Jetictors
 * Time           :  2019-12-27  11:11
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */

class TestFactory{

    fun test(){
        testSimpleDemo1()
        testSimpleDemo2()
        testSimpleDemo3()

        testMethodDemo1()
        testMethodDemo2()


    }

    private fun testSimpleDemo1(){
        // 普通工厂测试
        val firstFruit = FirstFruitFactory().createFactory("apple")
        firstFruit?.harvest()

        // 多个工厂方法测试
        val secondFruit = SecondFruitFactory().createBanana()
        secondFruit.harvest()

        // 静态工厂方法测试
        val thirdFruit = ThirdFruitFactory.createGrape()
        thirdFruit.harvest()
    }

    /**
     * 省略了抽象角色的工厂类 测试
     */
    private fun testSimpleDemo2(){
        val firstProduce = ProduceFactory().createProduce()
        firstProduce.update()
    }

    /**
     *  抽象角色、工厂类、具体角色合并到一起 即自身创建自身（外部不用new创建） 测试
     */
    private fun testSimpleDemo3(){
        val secondProduce = ConcreteProduce.createProduce()
        secondProduce.show()
    }

    /**
     * 测试简易工厂方法模式
     */
    private fun testMethodDemo1(){
        val factoryA = FactoryA()
        val produceA = factoryA.createProduce()
        produceA.showTest("ProduceA")

        val factoryB = FactoryB()
        val produceB = factoryB.createProduce()
        produceB.showTest("ProduceB")
    }

    /**
     * 测试复杂工厂方法模式
     */
    private fun testMethodDemo2(){
        val huaweiFactory = HuaweiFactory()
        val huaweiPhone = huaweiFactory.createPhone("P30 mate", "2019-9-12")
        huaweiPhone.aboutSelf()

        val xiaoMiFactory = XiaoMiFactory()
        val xiaoMiPhone = xiaoMiFactory.createPhone("Xiao Mi 9", "2019-9-12")
        xiaoMiPhone.aboutSelf()

        val americaFactory = AmericaFactory()
        val applePhone = americaFactory.createPhone("iPhone 11 max ", "2019-9-12")
        applePhone.aboutSelf()
    }



}