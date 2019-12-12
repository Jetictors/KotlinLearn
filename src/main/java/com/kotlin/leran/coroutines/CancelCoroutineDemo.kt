package com.kotlin.leran.coroutines

import kotlinx.coroutines.*

/**
 * Desc           :  协程取消测试
 * Author         :  Jetictors
 * Time           :  2019/10/11 11:08
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class CancelCoroutineDemo{

    fun test(){
        first()
    }

    private fun first() = runBlocking {
        val job = launch {
            repeat(50){
                println("job: I'm sleeping $it ...")
                delay(500)
            }
        }

        delay(1300)
        println("job: I'm wait")
//        job.cancel()
//        job.join()
        job.cancelAndJoin()
        println("job: I'm quit")
    }

    private fun second() = runBlocking {

    }

    private fun third() = runBlocking {
        
    }

}
