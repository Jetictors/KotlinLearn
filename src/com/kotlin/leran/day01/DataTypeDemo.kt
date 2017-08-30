package com.kotlin.leran.day01

/**
 * kotlin语法之数据类型详解
 * author : Jetictors
 * Created by loser's computer on 2017/8/31.
 */
fun main(args: Array<String>) {
    numberType()
}

/**
 * 数字类型
 * 1. Byte : 8位
 * 2. Short : 16位
 * 3. Int : 32位
 * 4. Long : 64位
 * 5. Float : 32位
 * 6. Double : 64位
 */
fun numberType(){
    var a: Byte = 2
    var b: Short = 2
    var c: Int = 2
    var d: Long = 2         //长整型由大写字母L标记
    var e: Float = 2f       //单精度浮点型由小写字母f或大写字符F标记
    var f: Double = 2.0
    var g = 0x0F            //十六进制数
    var h = 0b00001011      //二进制数
    var k = 123             //十进制数
    //ps: kotlin是不支持八进制数的

    println(" a => $a \n b => $b \n c => $c \n d => $d \n e => $e \n f => $f \n g => $g \n h => $h \n k => $k \n 切记：kotlin是不支持八进制数")

    /*
        数字类型字面常量的下划线
        作用：
     */
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    println("oneMillion => $oneMillion")
    println("creditCardNumber => $creditCardNumber")
    println("socialSecurityNumber => $socialSecurityNumber")
    println("hexBytes => $hexBytes")
    println("bytes => $bytes")


}