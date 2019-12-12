package com.kotlin.leran

import com.kotlin.leran.algorithm.Test
import com.kotlin.leran.basis.*
import com.kotlin.leran.cls.TypealiasDemo
import com.kotlin.leran.cls.classDemo.*
import com.kotlin.leran.coroutines.Basis
import com.kotlin.leran.coroutines.CancelCoroutineDemo
import com.kotlin.leran.design.adapter.ClassAdapter
import com.kotlin.leran.design.adapter.DefaultAdapter
import com.kotlin.leran.design.adapter.ObjectAdapter
import com.kotlin.leran.function.BasisFunctionDemo
import com.kotlin.leran.function.InfixFunDemo
import com.kotlin.leran.function.SeniorFunctionDemo
import com.kotlin.leran.function.lambda.LambdaDemo
import com.kotlin.leran.other.CollectionDemo
import com.kotlin.leran.other.OperaCollectionDemo
import kotlin.contracts.contract

/**
 * Desc           :  程序入口类
 * Author         :  Jetictors
 * Time           :  2019/9/16 14:28
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
suspend fun main(args: Array<String>) {

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
//     Basis().test()
//     CancelCoroutineDemo().test()



     // 测试 适配器模式
//     ClassAdapter().test()
//     ObjectAdapter().test()
//     DefaultAdapter().test()

    val test = Test()
//    test.test2(10000)
//    test.test3(10000)
    test.test4(10)
    test.test5(10)

}