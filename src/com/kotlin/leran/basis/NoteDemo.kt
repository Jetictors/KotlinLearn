package com.kotlin.leran.basis

/**
 * 描述 :     Kotlin语法之注释
 * author :  Jetictors
 * time :    2017/9/1  00:50
 * version : 1.0.1
 */
class NoteDemo{

    init {
        println("其实kotlin与java的注释是几乎相同的，都支持单行注释和多行注释（块注释）.\n 不过与java不同的kotlin中的块注释可以级联")
    }

    private fun note1(){
        // 1. 单行注释
        println("单行注释写法:")
        println("两个斜杠开头表示单行注释（'//'）！")
    }

    private fun note2(){
        /*
            2. 多行注释
         */
        println("多行注释的写法：")
        println("以斜杠加星号开头（/*），同时以星号加斜杠结尾（*/），中间这是要注释的代码块！")
    }

    private fun note3(){
        /*
            第一层块注释
           /*
               第二层块注释
               /*
                   第三层快注释
                   这种注释方式在java中是不支持的，但是在kotlin中是支持的。算是一个亮点吧（貌似意义不大）。
                */
            */
        */
    }

    /**
     * 函数注释
     * [a] 参数a
     * [b] 参数b
     */
    private fun note4(a : Int, b : Int){
        println("result = ${a + b}")
    }

    fun test(){
        note1()
        note2()
        note3()
        note4(1,2)
    }

}