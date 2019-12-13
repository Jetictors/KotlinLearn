package com.kotlin.leran

import com.kotlin.leran.design.adapter.ClassAdapter
import com.kotlin.leran.design.adapter.DefaultAdapter
import com.kotlin.leran.design.adapter.ObjectAdapter
import com.kotlin.leran.design.proxy.dynamic.cglib.Car
import com.kotlin.leran.design.proxy.dynamic.cglib.TestCglibFactory
import com.kotlin.leran.design.proxy.dynamic.jdk.*
import com.kotlin.leran.design.proxy.statics.demo1.Driver
import com.kotlin.leran.design.proxy.statics.demo1.FirstDriver
import com.kotlin.leran.design.proxy.statics.demo1.MoneyProxy
import com.kotlin.leran.design.proxy.statics.demo2.PlaneProxy
import com.kotlin.leran.design.proxy.statics.demo2.RailwayProxy
import com.kotlin.leran.design.proxy.statics.demo2.User
import java.lang.reflect.Proxy

/**
 * Desc           :  程序入口类
 * Author         :  Jetictors
 * Time           :  2019/9/16 14:28
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
fun main(args: Array<String>) {

     // 测试 HelloWorld
//     HelloWorld().test()

     // 测试 变量
//     VariableAndConstantDemo().test()

     // 测试 常量
//     Constant().test()

     // 测试 注释
//     NoteDemo().test()

     // 测试 数据类型
//     DataTypeDemo().test()

     // 测试 控制语句（if、for、while...）
//     ControlStatementDemo().test()

     // 测试 空安全
//     NullAndNullCheckDemo().test()

     // 测试 操作符
//     OperatorStringDemo().test()

     // 测试 函数基础
//     BasisFunctionDemo().test()

     // 测试 类的声明
//     ClassDemo1().test()

     // 测试 属性与字段
//     FieldDemo().test()

     // 测试 抽象类
//     AbstarctClassDemo().test()

     // 测试 数据类
//     DataClassDemo().test()

     // 测试 枚举类
//     EnumDemo().test()

     // 测试 内部类
//     InnerClassDemo().test()

     // 测试 密封类
//     SealedClassDemo().test()

     // 测试 继承
//     InheritClsDemo().test()

     // 测试 接口
//     InterfaeDemo().test()

     // 测试 类型别名
//     TypealiasDemo().test()

     // 测试 Lambda语法
//     LambdaDemo().test()

     // 测试 中缀函数
//     val infixDemo = InfixFunDemo()
//     infixDemo testInFix  ("测试中缀函数")
//     infixDemo.test()

     // 测试高阶函数
//     SeniorFunctionDemo().test()

     // 测试 集合初始化
//     CollectionDemo().test()

     // 测试 集合的各种操作
//     OperaCollectionDemo().test()

     // 测试协程
//      testCoroutine()

     // 测试 适配器模式
//      testAdapter()

    // 测试静态代理
//     testStaticsProxy()

    // 测试动态代理
//     testDynamicProxy()
}

/**
 * 测试协程
 */
private fun testCoroutine(){

}

/**
 * 测试算法
 */
private fun testAlgorithm(){

}

/**
 * 测试适配器模式
 */
private fun testAdapter(){
    ClassAdapter().test()
    ObjectAdapter().test()
    DefaultAdapter().test()
}

/**
 * 测试静态代理
 */
private fun testStaticsProxy(){
    val user = User()
    val planeProxy = PlaneProxy(user)
    planeProxy.buyTicket("深圳-重庆", 783.56)

    val railwayProxy = RailwayProxy(user)
    railwayProxy.buyTicket("广州南-重庆西", 428.23)

    val driver = Driver()
    val driverProxy2 = MoneyProxy(driver)
    driverProxy2.giveMoney(5,13)

    val firstDriver = FirstDriver()
    firstDriver.giveMoney(7,12)
}

/**
 * 测试动态代理
 */
private fun testDynamicProxy(){
    val railway = Railway()
    var handler = ProxyHandler(railway)
    val railwayProxy = Proxy.newProxyInstance(railway.javaClass.classLoader,
            railway.javaClass.interfaces, handler) as IDynamicTicket
    railwayProxy.buyTicket("广州南-重庆西", 428.34)

    val plane = Plane()
    handler = ProxyHandler(plane)
    val planeProxy = Proxy.newProxyInstance(plane.javaClass.classLoader,
            plane.javaClass.interfaces, handler) as IDynamicTicket
    planeProxy.buyTicket("深圳-重庆", 1028.34)

    val boat = Boat()
    handler = ProxyHandler(boat)
    val boatProxy = Proxy.newProxyInstance(boat.javaClass.classLoader,
            boat.javaClass.interfaces, handler) as IDynamicTicket
    boatProxy.buyTicket("深圳-香港", 167.34)

    val car = Car()
    val carProxy = TestCglibFactory(car).creator()
    carProxy.buyCarTicket("深圳-广州", 137.5)

}