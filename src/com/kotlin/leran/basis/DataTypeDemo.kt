package com.kotlin.leran.basis

/**
 * 描述 ：    Kotlin语法之数据类型详解
 * anthor :  Jetictors
 * time :    2017/9/2  22:01
 * version : 1.0.1
 */
fun main(args: Array<String>) {
    numberType()
    booleanType()
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
    var d: Long = 2L         //长整型由大写字母L标记
    var e: Float = 2.0f       //单精度浮点型由小写字母f或大写字符F标记
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
        装箱
     */
    val numValue: Int = 127
    //装箱的过程
    val numValueBox: Int? = numValue
    println("装箱后： numValueBox => $numValueBox")

    /*
        比较两个数字
     */
    var result: Boolean
    result = numValue == numValueBox
    println("numValue == numValueBox => $result")  // => true,其值是相等的


    result = numValue === numValueBox
    println("numValue === numValueBox => $result")  // => false,其地址是不一样的



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

    /*
        位运算符
        支持序列如下：shl、shr、ushr、and、or、xor
     */
    var operaNum: Int = 4

    var shlOperaNum = operaNum shl(2)
    var shrOperaNum = operaNum shr(2)
    var ushrOperaNum = operaNum ushr(2)
    var andOperaNum = operaNum and(2)
    var orOperaNum = operaNum or(2)
    var xorOperaNum = operaNum xor(2)
    var invOperaNum = operaNum.inv()

    println("shlOperaNum => $shlOperaNum \n " +
            "shrOperaNum => $shrOperaNum \n " +
            "ushrOperaNum => $ushrOperaNum \n " +
            "andOperaNum => $andOperaNum \n " +
            "orOperaNum => $orOperaNum \n " +
            "xorOperaNum => $xorOperaNum \n " +
            "invOperaNum => $invOperaNum \n ")

}

/**
 * 字符型
 */
fun charType(){
    //字符由Char类型表示，它不能直接同视为数字，不过可以显示转换
    var char1: Char = 'a'
    //char1 = 1        //=> 这句代码会直接出错
    println("char1 => $char1")

    /*
        字符显示转换
     */
    var var1 = char1.toByte()
    var var2 = char1.toInt()
    var var3 = char1.toString()
    var var4 = char1.toFloat()
    var var5 = char1.toShort()
    println("var1 => $var1 \n var2 => $var2 \n var3 => $var3 \n var4 => $var4 \n var5 => $var5")

    /*
        当字符变量为英文字母时，大小写的转换
     */
    var charA: Char = 'a'
    var charB: Char = 'B'
    var charNum: Char = '1'
    var result: Char

    // 转换为大写
    result = charA.toUpperCase()
    println("result => $result")

    // 转换为小写
    result = charB.toLowerCase()
    println("result => $result")

    //当字符变量不为英文字母时，转换无效
    result = charNum.toLowerCase()
    println("result => $result")

    /*
        转义字符
        同Java一样，使用某些特殊的字符时，要使用转义。
        需转义的字符如下：
        \t => 表示制表符
        \n => 表示换行符
        \b => 表示退格键（键盘上的Back建）
        \r => 表示键盘上的`Enter`键
        \\ => 表示反斜杠
        \' => 表示单引号
        \" => 表示双引号
        \$ => 表示美元符号，如果不转义在kotlin中就表示变量的引用了
        其他的任何字符请使用Unicode转义序列语法。例：'\uFF00'
     */
    println("\n  换行符")
    println("\t  制表符")
    println(" \b  退格键")
    println("\r  Enter键同样换行")
    println('\\')
    println('\'')
    println('\"')
    println('\$')
    println('\uFF01')

}

/**
 * Boolean型
 */
fun booleanType(){
    /*
        定义：
     */
    var isNum: Boolean
    isNum = false
    println("isNum => $isNum")

    /*
        操作运算符
        ' || ' => 逻辑或（或者）
        ' && ' => 逻辑与（并且）
        ' ! ' => 逻辑非（取反）
     */
    var a: Boolean = false
    var b: Boolean = true
    var result: Boolean

    /* 逻辑或操作 */
    if (a || b){
        result = a || b
        println("a || b => $result")
    }

    /* 逻辑与操作 */
    if (a && b){
        result = a && b
        println("a && b => $result")
    }

    /* 逻辑非操作 */
    result = !a
    println("!a => $result")

    result = !b
    println("!b => $result")

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
    for (v in arr1){
        print(v)
        print("\t")
    }

    println()

    var arr2 = arrayOf("0","2","3",'a',32.3f)
    for (v in arr2){
        print(v)
        print("\t")
    }

    println()

    // 2. arrayOfNulls() =>用于创建一个指定数据类型且可以为空元素的给定元素个数的数组
    var arr3 = arrayOfNulls<Int>(3)

    //如若不予数组赋值则arr3[0]、arr3[1]、arr3[2]皆为null
    for(v in arr3){
        print(v)
        print("\t")
    }

    println()

    //为数组arr3赋值
    arr3[0] = 10
    arr3[1] = 20
    arr3[2] = 30

    for(v in arr3){
        print(v)
        print("\t")
    }

    println()

    /*
         3. 使用一个工厂函数，它使用数组大小和返回给定其索引的每个数组元素的初始值的函数
         Array() => 第一个参数表示数组元素的个数，第二个参数则为使用其元素下标组成的表达式
    */
    var arr4 = Array(5,{index -> (index * 2).toString() })
    for (v in arr4){
        print(v)
        print("\t")
    }

    println()

    /*
        在kotlin中数组类型与Java不同的是，kotlin中的数组是不变的，这样可以防止可能的运行时故障
        类型投影：这一点在泛型章节中会详细的介绍。这里不多做累述
     */

    /*
        Kotlin还有专门的类来表示原始类型的数组，没有装箱开销.
        ByteArray
        ShortArray
        IntArray
        LongArray
        BooleanArray
        CharArray
        FloatArray
        DoubleArray
     */
    var intArr: IntArray = intArrayOf(1,2,3,4,5)
    for (number in intArr){
        print(number)
        print("\t")
    }

    println()

    var charArr: CharArray = charArrayOf('a','1','b','c','3','d')
    for (char in charArr){
        print(char)
        print("\t")
    }

    println()

    var longArr: LongArray = longArrayOf(12L,1254L,123L,111L)
    for (long in longArr){
        print(long)
        print("\t")
    }
}

/**
 * 字符串类型
 */
fun stringType(){
    // 1. 字符串由String类型表示。并且其是不可变的。字符串的元素可以通过索引操作的字符：s[i]来访问。可以使用for循环迭代字符串：
    val str: String = "kotlin"
    println("str => $str")

    //迭代
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
    var str1: String = "hello\t\tkotlin"
    println(str1)
    str1 = "hello kotlin"
    println(str1)

    val str2 = """ fun main(args: Array<String>){
        println("我是三重引号引用的字符串，我可以包含任意字符")
        } """
    println(str2)

    //可以使用trimMargin()函数删除前导空格 默认使用符号('|')作边距前缀，当然也可以使用其他字符。例：('>'，'<'等)
    val str3: String = """
        > I`m like Kotlin .
        > I`m like Java .
        > I`m like Android .
        > I`m like React-Native.
    """.trimMargin(">")
    println(str3)


    /*
        字符串模板
        使用字符串模板的符号为（'$'）.
        在$符号后面加上变量名或大括号中的表达式
    */
    val text1: String = "我来了！"
    var text2: String = "$text1 kotlin"
    var text3: String = "$text2 ${text1.length} 哈哈！！！！"
    println(text1)
    println(text2)
    println(text3)
}