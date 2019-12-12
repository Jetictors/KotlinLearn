package com.kotlin.leran.coroutines

import kotlinx.coroutines.*


/**
 * Desc           :  协程基础
 * Author         :  Jetictors
 * Time           :  2019/10/9 11:20
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class Basis{

    suspend fun test(){
//        first()
//        second()
//        third()
//        fourth()
//        five()
//        six()
//        seven()
//        eight()
//        nine()
//        newNine()
        ten()
        newTen()
    }

    /**
     * 第一个协程程序
     */
    private fun first(){
        GlobalScope.launch {
            delay(1000)
            println("协程")
        }
        println("kotlin")
        Thread.sleep(2000)
    }

    /**
     * 用Thread替换协程，达到相同的效果
     */
    private fun second(){
        Thread{
            Thread.sleep(1000)
            println("协程")
        }.start()
        println("kotlin")
        Thread.sleep(2000)
    }

    /**
     * 桥接阻塞
     */
    private fun third(){
        GlobalScope.launch {
            delay(1000)
            println("协程")
        }
        println("kotlin")
        runBlocking {
            delay(2000)
        }
    }

    /**
     * 优化桥接阻塞函数，更符合开发习惯
     */
    private fun fourth() = runBlocking {
        GlobalScope.launch {
            delay(1000)
            println("协程")
        }
        println("kotlin")
        delay(2000)
    }

    /**
     * 等待一个作业
     */
    private suspend fun five(){

        val job = GlobalScope.launch {
            delay(1000)
            println("协程")
        }
        println("kotlin")
        job.join()

    }

    /**
     * 结构化并发
     */
    private fun six() = runBlocking {
        launch {
            delay(1000)
            println("协程")
        }
        println("Kotlin")
    }

    /**
     * 作用域构建器
     */
    private fun seven() = runBlocking {
        launch {
            delay(1000)
            println("Task from runBlocking")
        }

        coroutineScope{
            launch {
                delay(1500)
                println("Task from nested launch")
            }

            delay(500)
            println("Task from coroutine scope")
        }

        println("Coroutine scope is over")
    }

    /**
     * 函数重构使用
     */
    private fun eight() = runBlocking {
        launch { doWorld("协程") }
        println("kotlin")
    }

    /**
     * 测试协程的轻量级
     */
    private fun nine() = runBlocking {
        /*
            repeat函数是一个高阶函数，即循环作一件事
            [times] 循环次数
            [action] 动作（事情）
          */
        repeat(100_000){
            launch {
                delay(1000)
                print(".")
            }
        }
    }

    /**
     * 用线程作对比
     */
    private fun newNine(){
        repeat(100_000){
            Thread {
                print(".")
            }.start()
        }
    }

    private fun ten(){

        println("start")

        run{
            repeat(50){
                if (it == 20) return@repeat
                println("running $it")
            }
        }

        println("stop")
    }

    private fun newTen(){
        println("start")

        run{
            repeat(50){
                if (it == 20) return@run
                println("running $it")
            }
        }

        println("stop")
    }

    /**
     * 提取函数重构
     */
    private suspend fun doWorld(world : String){
        delay(1000)
        println(world)
    }

}
