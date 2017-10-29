package com.kotlin.leran.basis

/**
 * 描述 ：    Kotlin语法之控制语句
 * anthor :  Jetictors
 * time :    2017/9/23  11:35
 * version ：1.0.1
 */

fun main(args: Array<String>) {
    ifExample()
    forExample()
    whileExample()
    doWhileExample()
    whenExample()
    controlExample()
}

/**
 * 流程控制之if语句
 */
fun ifExample(){

    /* 1. 传统写法 类似Java */
    var numA = 2
    if (numA == 2){
        println("numA == $numA => true")
    }else{
        println("numA == $numA => false")
    }

    /*
        2. Kotlin之中的三元运算符
        在Kotlin中其实是不存在三元运算符( condition ? then : else )这种操作的。
        那是因为if语句的特性(if表达式会返回一个值)故而不需要三元运算符。
    */

    // 在Java中可以这么写，但是Kotlin中直接会报错。
    // var numB: Int = (numA > 2) ? 3 : 5

    // kotlin中直接用if..else替代。例：
    var numB: Int = if ( numA > 2 ) 3 else 5  // 当numA大于2时输出numB的值为5，反之为3
    println("numB = > $numB")

    /*
        3. kotlin中if不仅可以作为表达式，也可以作为一个块结构，并且最后一句表达式为块的值
    */
    var numC: Int = if (numA > 2){
        numA++
        numA = 10
        println("numA > 2 => true")
        numA
    }else if (numA == 2){
        numA++
        numA = 20
        println("numA == 2 => true")
        numA
    }else{
        numA++
        numA = 30
        println("numA < 2 => true")
        numA
    }

    /*
        根据上面的代码可以看出，每一个if分支里面都是一个代码块，并且返回了一个值。根据条件numC的值应该为20
     */
    println("numC => $numC")

}

/**
 * 流程控制之for语句
 */
fun forExample(){

    /*
        1. kotlin废除了Java中的for(初始值;条件；增减步长)这个规则。
        但是kotlin中对于for循环语句新增了其他的规则，来满足刚提到的规则。
     */

    /*
        递增，并且步长为 1 循环5次
        关键字：until
        范围：until[n,m)
     */
    for (i in 0 until 5){
        print("i => $i \t")
    }
    println()

    /*
        递减，并且步长为 1 循环5次
        关键字：downTo
        范围：downTo[n,m]
     */
    for (i in 15 downTo 11){
        print("i => $i \t")
    }
    println()

    /*
        for循环默认是递增，下面看另一种方式
        即：for( i in n .. m),范围为[n,m]
     */
    print("使用 符号`..`的打印结果\n")
    for (i in 20 .. 25){
        print("i => $i \t")
    }

    println()

    print("使用until的打印结果\n")
    for (i in 20 until 25){
        print("i => $i \t")
    }

    println()

    /*
        设置步长
        关键字:step
     */
    for (i in 10 until 16 step 2){
        print("i => $i \t")
    }
    println()

    /*
        2. 迭代
        for循环提供迭代器用来遍历任何东西
        for循环数组被编译为一个基于索引的循环，它不会创建一个迭代器对象
     */
    // 1. 遍历字符串 => 这点在数据类型中的字符串类型中讲过
    for (i in "abcdefg"){
        print("i => $i \t")
    }
    println()


    // 2. 遍历数组 => 这点在数据类型章节中的数组类型中讲过
    var arrayListOne = arrayOf(10,20,30,40,50)
    for (i in arrayListOne){
        print("i => $i \t")
    }
    println()

    /*
        要遍历具有索引的数组或列表请使用下面两种方式
     */
    //3.使用数组的indices属性遍历。
    var arrayListTwo = arrayOf(1,3,5,7,9)
    for (i in arrayListTwo.indices){
        println("arrayListTwo[$i] => " + arrayListTwo[i])
    }

    // 4. 使用数组的withIndex()方法遍历
    for ((index,value) in arrayListTwo.withIndex()){
        println("index => $index \t value => $value")
    }

    /*
        5. for迭代提供迭代器的任何内容
        即：数组或列表有一个成员或扩展函数iterator()实现了Iterator<T>接口，且该接口提供了next()与hasNext()两个成员或扩展函数
        其一般和while循环一起使用
     */
    var arrayListThree = arrayOf(2,'a',3,false,9)
    var iterator: Iterator<Any> = arrayListThree.iterator()

    while (iterator.hasNext()){
        println(iterator.next())
    }
}

/**
 * 流程控制之when语句
 */
fun whenExample(){
    /*
       在Kotlin中已经废除掉了Java中的switch语句。而新增了when(exp){}语句。
       when语句不仅可以替代掉switch语句，而且比switch语句更加强大
     */

    // 1. when语句实现switch语句功能
    when(5){
        1 -> {
            println("1")
        }
        2 -> println("2")
        3 -> println("3")
        5 -> {
            println("5")
        }
        else -> {
            println("0")
        }
    }

    // 2. 和逗号结合使用，相当于switch语句中的不使用break跳转语句
    when(1){
        1 , 2 , 3 -> {
            println("1")
        }
        5 -> {
            println("5")
        }
        else -> {
            println("0")
        }
    }

    /*
        3. 条件可以使用任意表达式，不仅局限于常量
    */
    var num:Int = 5
    when(num > 5){
        true -> {
            println("num > 5")
        }
        false ->{
            println("num < 5")
        }
        else -> {
            println("num = 5")
        }
    }

    /*
        4. 检查值是否存在于集合或数组中.
        使用操作符：
                在（in）
                不在（!in）
        限定:只适用于数值类型
     */
    var arrayList = arrayOf(1,2,3,4,5)
    when(1){
        in arrayList.toIntArray() -> {
            println("元素`1`存在于 arrayList数组中")
        }
        in 0 .. 10 -> println("1 属于于 0~10 中")
        !in 5 .. 10 -> println("1 不属于 5~10 中")
        else -> {
            println("都错了 哈哈！")
        }
    }

    /*
        5. 检查值是否为指定类型的值
        值得注意的是，kotlin智能转换可以访问类型的方法和属性
        使用操作符：
                是（is）
                不是（!is）
     */
    when("abc"){
        is String -> println("abc是一个字符串")
        else -> {
            println("abc不是一个字符串")
        }
    }

    var a: Int = 2
    when(a){
        !is Int -> {
            println("$a 不是一个Int类型的值")
        }
        else -> {
            a = a.shl(2)
            println("a => $a")
        }
    }

    /*
        6. 不使用表达式的when语句
        则表示为最简单的布尔表达式
     */
    var array = arrayOfNulls<String>(3)
    when{
         true -> {
             for (i in array){
                 print(" $i \t")
             }
             println()
         }
         else -> {

         }
    }

}

/**
 * 流程控制之while语句
 */
fun whileExample(){
    /*
        Kotlin中的while循环同Java中的一样，其定义格式为：
        while(exp){  其中exp为表达式
            ...
        }
     */

    var num = 5
    var count = 1
    while (num < 10){
        println("num => $num")
        println("循环了$count 次")
        count++
        num++
    }

}

/**
 * 流程控制之do..while语句
 */
fun doWhileExample(){

    /*
      Kotlin中的while循环同Java中的一样，其定义格式为：
       do{...}while(exp)
     */
    var num = 5
    var count = 1
    do {
        println("num => $num")
        println("循环了$count 次")
        count++
        num++
    }while (num < 10)

    // do{...}while(exp)与while(exp){...}最大的区别是do{...}while(exp)最少执行一次

    num = 5
    count = 1
    do {
        println("num => $num")
        println("循环了$count 次")
        count++
        num++
    }while (num < 5)
}

/**
 * 流程控制之控制语句
 * 1. return
 * 2. break
 * 3. continue
 */
fun controlExample(){
    /*
        1. return语句,同Java中的return语句一样
        默认情况下，从最近的封闭函数或匿名函数返回。
     */
    returnExample()

    /*
        2. break语句，同Java中的break语句一样
        终止最近的闭合循环。
     */
    breakExample()

    /*
        3. continue语句,同Java中的continue语句一样
        前进到最近的封闭循环的下一个步骤(迭代)。
     */
    continueExample()
}

fun continueExample() {
    for (i in 1 until 10){
        if (i == 5){
            println("我跳过了第$i 次循环")
            continue
        }
        println("i => $i")
    }
}

fun breakExample() {
    var count: Int = 1
    for (i in 1 until 10){
        if (i == 5){
            println("我在第$i 次退出了循环")
            break
        }
        count++
    }
    println("我循环了多少次：count => $count")
}

fun returnExample(){
    var str: String = ""
    if (str.isBlank()){
        println("我退出了该方法")
        return
    }
}
