package com.kotlin.leran.function

/**
 * 描述 ：    高阶函数详解
 * anthor :  Jetictors
 * time :    2018/4/7  22:25
 * version : v1.0.1
 */

fun main(args: Array<String>) {

//    testTODO()
    testRun1()
    testRun2()
    testWith()
}

/**
 * 测试with(参数){}函数
 */
private fun testWith() {
}

/**
 * 测试T.run{}函数
 */
private fun testRun2() {
    val str = "123"
    str.run { println( this.length) }
}

/**
 * 测试run{}函数
 */
private fun testRun1() {

    val str = "123"
    run{
        str.length
    }
}

/**
 * 测试TODO函数
 */
private fun testTODO() {
    TODO("测试TODO函数，是否显示抛出错误")
}
 
