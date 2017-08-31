package com.kotlin.leran.day01

/**
 * kotlin语法之数据类型详解
 * author : Jetictors
 * Created by loser's computer on 2017/8/31.
 */
fun main(args: Array<String>) {
    numberType()
    charType()
    arrayType()
    stringType()
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
        作用：分割数字进行分组
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

    /*
        显示转换
        较小的类型不会被隐式转换为更大的类型，故而系统提供了显示转换
     */
    var numA: Int = 97
    println(numA.toByte())
    println(numA.toShort())
    println(numA.toInt())
    println(numA.toFloat())
    println(numA.toDouble())
    println(numA.toLong())
    println(numA.toChar())
    println(numA.toString())

    /*
        隐式转换
        类型是从上下文推断出来的
        而算术运算则被重载为适当的转换
    */
    // 30L + 12 -> Long + Int => Long
    val num = 30L + 12
    print(num)

}

/**
 * 字符型
 */
fun charType(){
    //字符由Char类型表示，它不能和Java一样可以直接同视为数字，不过可以显示转换
    var char1: Char = 'a'
    println(char1)
    //char1 == 1        => 这句代码会直接出错

    var num1 = char1.toByte()
    var num2 = char1.toInt()
    var num3 = char1.toString()
    var num4 = char1.toFloat()
    println(num1)
    println(num2)
    println(num3)
    println(num4)
}

/**
 * Boolean型
 */
fun booleanType(){
    //Boolean类型同Java一样，在此不做累述
}

/**
 * 数组类型
 */
fun arrayType(){
    /*
        kotlin中数组由Array<T>表示，可以去看看源码实现，里面就几个方法
        创建数组的3个函数
     */

    // 1. arrayOf() => 参数是一个可变参数的泛型对象
    var arr1 = arrayOf(1,2,3,4,5) //等价于[1,2,3,4,5]
    var arr2 = arrayOf("0","2","3",'a',32.3f)
    for (v in arr1){
        println(v)
    }

    for (v in arr2){
        println(v)
    }

    // 2. arrayOfNulls() =>用于创建一个指定数据类型且可以为空元素的给定元素个数的数组
    var arr3 = arrayOfNulls<Int>(3)

    //如若不予数组赋值则arr3[0]、arr3[1]、arr3[2]皆为null
    for(v in arr3){
        println(v)
    }

    //为数组arr3赋值
    arr3[0] = 10
    arr3[1] = 20
    arr3[2] = 30

    for(v in arr3){
        println(v)
    }

    /*
         3. 使用一个工厂函数，它使用数组大小和返回给定其索引的每个数组元素的初始值的函数
         Array() => 第一个参数表示数组元素的个数，第二个参数则为使用其元素下标组成的表达式
    */
    var arr4 = Array(5,{index -> (index * 2).toString() })
    for (v in arr4){
        println(v)
    }

    /*
        在kotlin中数组类型与Java不同的是，kotlin中的数组是不变的，这样可以防止可能的运行时故障
        类型投影：这一点在泛型章节中会详细的介绍。这里不多做累述
     */

    /*
        Kotlin还有专门的类来表示原始类型的数组，没有装箱开销，它们分别是：ByteArray, ShortArray, IntArray等等。例：
     */
    var intArr: IntArray = intArrayOf(1,2,3,4,5)
    var byteArr: ByteArray = byteArrayOf(1,2,3,4,5)
    var longArr: LongArray = longArrayOf(12L,1254L,123L,111L)

    for (long in longArr){
        println(long)
    }
}

/**
 * 字符串类型
 */
fun stringType(){
    // 1. 字符串有String类型表示。并且其是不可变的。字符串的元素可以通过索引操作的字符：s[i]来访问。可以使用for循环迭代字符串：
    val str: String = "kotlin"
    for (s in str){
        print(s)
        print("\t")
    }
    print("\n")

    /*
        2. 字符串字面量，在kotlin中有两种类型：
            - 包含转义字符的字符串 转义包括（'\t','\n'等）
            - 包含任意字符的字符串 由三重引号包括（""" .... """）
     */
    val str1: String = "hello\tkotlin"
    println(str1)

    val str2 = """ fun main(args: Array<String>){
        println("我是三重引号引用的字符串，我可以包含任意字符")
        } """
    println(str2)

    //可以使用trimMargin()函数删除前导空格 默认使用符号('|')作为距前缀，当然也可以使用其他字符。例：('>'，'<'等)
    val str3: String = """
        | Tell me and I forget.
        | Teach me and I remember.
        | Involve me and I learn.
        | (Benjamin Franklin)
    """.trimMargin("|")
    println(str3)


    /*
        字符串模板
        使用字符串模板的符号为（'$'）在$符号后面加上变量名或大括号中的表达式
    */
    val text1: String = "我来了！"
    var text2: String = "$text1 kotlin"
    var text3: String = "$text2 ${text1.length} 哈哈！！！！"
    println(text1)
    println(text2)
    println(text3)
}