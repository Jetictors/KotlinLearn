package com.kotlin.leran

import com.kotlin.leran.basis.*
import com.kotlin.leran.cls.TypealiasDemo
import com.kotlin.leran.cls.classDemo.*
import com.kotlin.leran.design.adapter.ClassAdapter
import com.kotlin.leran.design.adapter.DefaultAdapter
import com.kotlin.leran.design.adapter.ObjectAdapter
import com.kotlin.leran.function.BasisFunctionDemo
import com.kotlin.leran.function.SeniorFunctionDemo
import com.kotlin.leran.function.lambda.LambdaDemo
import com.kotlin.leran.other.CollectionDemo
import com.kotlin.leran.other.OperaCollectionDemo

/**
 * Desc           :  程序入口类
 * Author         :  Jetictors
 * Time           :  2019/9/16 14:28
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
fun main(args: Array<String>) {

    // test HelloWorld.kt
    // HelloWorld().test()

    // test VariableAndConstantDemo
    // VariableAndConstantDemo().test()

    // test Constant.kt
    // Constant().test()

    // test NoteDemo
    // NoteDemo().test()

    // test DataTypeDemo
    // DataTypeDemo().test()

    // test ControlStatementDemo.kt
    // ControlStatementDemo().test()

    // test NullAndNullCheckDemo
    // NullAndNullCheckDemo().test()

    // test OperatorStringDemo
    // OperatorStringDemo().test()

    // 函数基础
    // BasisFunctionDemo().test()

    // 测试类的声明
    // ClassDemo1().test()

    // 测试属性与字段
    // FieldDemo().test()

    // 测试抽象类
    // AbstarctClassDemo().test()

    // 测试数据类
    // DataClassDemo().test()

    // 测试枚举类
    // EnumDemo().test()

    // 测试内部类
    // InnerClassDemo().test()

    // 测试密封类
    // SealedClassDemo().test()

    // 测试继承
    // InheritClsDemo().test()

    // 测试接口
    // InterfaeDemo().test()

    // 测试类型别名
    // TypealiasDemo().test()



    // 测试Lambda语法demo
    // LambdaDemo().test()

    // 测试高阶函数
    // SeniorFunctionDemo().test()

    // 测试集合初始化
    // CollectionDemo().test()

    // 测试集合的各种操作
    // OperaCollectionDemo().test()



    // 测试适配器模式
    ClassAdapter().test()
    ObjectAdapter().test()
    DefaultAdapter().test()

}