package com.kotlin.leran.function

/**
 * 描述 ：    高阶函数详解
 * author :  Jetictors
 * time :    2018/4/7  22:25
 * version : v1.0.1
 */


class SeniorFunctionDemo{

    /**
     * 测试T.let()函数，以及查看其和T.also()和`T.apply()`函数的区别
     */
    private fun testLet() {
        "kotlin".let {
            println("原字符串：$it")         // kotlin
            it.reversed()
        }.let {
            println("反转字符串后的值：$it")     // niltok
            it.plus("-java")
        }.let {
            println("新的字符串：$it")          // niltok-java
        }

        "kotlin".also {
            println("原字符串：$it")     // kotlin
            it.reversed()
        }.also {
            println("反转字符串后的值：$it")     // kotlin
            it.plus("-java")
        }.also {
            println("新的字符串：$it")        // kotlin
        }

        "kotlin".apply {
            println("原字符串：$this")     // kotlin
            this.reversed()
        }.apply {
            println("反转字符串后的值：$this")     // kotlin
            this.plus("-java")
        }.apply {
            println("新的字符串：$this")        // kotlin
        }
    }

    /**
     * 测试T.also()函数，并说明和T.apply()的区别
     */
    private fun testAlso() {

        "kotlin".also {
            println("结果：${it.plus("-java")}")
        }.also {
            println("结果：${it.plus("-php")}")
        }

        "kotlin".apply {
            println("结果：${this.plus("-java")}")
        }.apply {
            println("结果：${this.plus("-php")}")
        }

    }

    /**
     * 测试T.takeUnless()函数
     */
    private fun testTakeUnless() {

        val str = "kotlin"

        val result = str.takeUnless {
            it.startsWith("ko")
        }

        println("result = $result")
    }

    /**
     * 测试T.takeIf()函数
     */
    private fun testTakeIf() {

        val str = "kotlin"

        val result = str.takeIf {
            it.startsWith("ko")
        }

        println("result = $result")
    }

    /**
     * 测试repeat()高阶函数
     */
    private fun testRepeat() {
        repeat(5){
            println("我是重复的第${it + 1}次，我的索引为：$it")
        }
    }

    /**
     * 测试自定义的高阶函数
     */
    private fun testDemo() {
        val result1 = resultByOpt(1,2){
            num1, num2 ->  num1 + num2
        }

        val result2 = resultByOpt(3,4){
            num1, num2 ->  num1 - num2
        }

        val result3 = resultByOpt(5,6){
            num1, num2 ->  num1 * num2
        }

        val result4 = resultByOpt(6,3){
            num1, num2 ->  num1 / num2
        }

        println("result1 = $result1")
        println("result2 = $result2")
        println("result3 = $result3")
        println("result4 = $result4")
    }

    private fun resultByOpt(num1 : Int , num2 : Int , result : (Int ,Int) -> Int) : Int{
        return result(num1,num2)
    }

    private fun testLock() {
        val testStr = "abc"
        val sum = testStr.sumBy { it.toInt() }
        println(sum)

    }

    /**
     * 测试with(参数){}函数
     */
    private fun testWith() {
        val str = "kotlin"
        with(str) {
            println( "length = ${this.length}" )
            println( "first = ${first()}")
            println( "last = ${last()}" )
        }

        val newStr : String? = "kotlin"

        with(newStr){
            println( "length = ${this?.length}" )
            println( "first = ${this?.first()}")
            println( "last = ${this?.last()}" )
        }

        newStr?.run {
            println( "length = $length" )
            println( "first = ${first()}")
            println( "last = ${last()}" )
        }
    }

    /**
     * 测试T.run{}函数
     */
    private fun testRun2() {
        val str = "kotlin"
        str.run {
            println( "length = ${this.length}" )
            println( "first = ${first()}")
            println( "last = ${last()}" )
        }
    }

    /**
     * 测试run{}函数
     */
    private fun testRun1() {
        val str = "kotlin"

        run{
            val str = "java"
            println("str = $str")
        }

        println("str = $str")

        val index = 3
        val num = run {
            when(index){
                0 -> "kotlin"
                1 -> "java"
                2 -> "php"
                3 -> "javaScript"
                else -> "none"
            }
        }.length
        println("num = $num")

    }

    /**
     * 测试TODO函数
     */
    private fun testTODO() {
        TODO("测试TODO函数，是否显示抛出错误")
    }

    fun test(){
        testLock()
        testDemo()
        testTODO()
        testRun1()
        testRun2()
        testWith()
        testAlso()
        testLet()
        testTakeIf()
        testTakeUnless()
        testRepeat()
    }

}
