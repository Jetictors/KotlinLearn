package com.kotlin.leran.other

/**
 * 描述 ：    处理集合的高级函数
 * anthor :  Jetictors
 * time :    2018/4/1  22:59
 * version : v1.0.1
 */


fun main(args: Array<String>) {

    listToArray()
    arrayToList()
    listToList()
    getElement()
    findElement()
    findIndex()
}

/**
 * 根据元素值查找元素下标
 */
fun findIndex() {
    val list = listOf<String>("kotlin","Android","Java","PHP","Python","IOS")

    val index1 = list.indexOf("Java")
    val index2 = list.indexOfFirst { it == "kotlin" }
    val index3 = list.indexOfLast { it == "kotlin" }

    val index4 = list.lastIndexOf("Android")
    val index5 = list.lastIndex

    println("index1 = $index1 \t index2 = $index2 \t index3 = $index3 \t index4 = $index4 \t index5 = $index5 \t ")

}

/**
 * 查找元素
 */
fun findElement() {

    val list = listOf<String>("kotlin","Android","Java","PHP","Python","IOS")

    // first() : 获取第一个元素
    val first1 = list.first()
    // first{} : 根据条件获取第一个元素,当不满足条件时，会抛出NoSuchElementException异常
    val first2 = list.first { it == "kotlin" }
    println("first1 = $first1 \t first2 = $first2")

    // last() : 获取最后一个元素
    val last1 = list.last()
    // last{} : 根据条件获取最后一个元素,当不满足条件时，会抛出NoSuchElementException异常，当条件为第一个元素的值时，也会抛出异常
    val last2 = list.last{ it  == "Android"}
    println("last1 = $last1 \t last2 = $last2")

    // find{} : 查找元素
    val find1 = list.find { it == "Java" }
    // findLast{} : 查找元素
    val find2 = list.findLast { it == "Android" }
    println("find1 = $find1 \t find2 = $find2")
}

/**
 * 获取列表或数组元素
 */
fun getElement() {

    val list = listOf<String>("kotlin","Android","Java","PHP","Python","IOS")
    /*
        1. 使用get(index)获取
     */
    val element1 = list.get(0)

    /*
        2. 使用arr[index]获取
     */
    val element2 = list[0]

    /*
        3. 使用arr.get
     */
    val element3 = list.component1()

    println("element1 = $element1 \t element2 = $element2 \t element3 = $element3")

//    val arr = listOf(1,2)
//    arr.component4()
}

/**
 * 数组转集合
 */
fun arrayToList() {

    val arr = arrayOf(1,3,5,7,9)
    val list = arr.toList()
    println("变量arr的类型为：${arr.javaClass}")
    println("变量list的类型为：${list.javaClass}")
    println(list[1])
}

/**
 * 集合转集合
 */
fun listToList(){
    val set = setOf(1)
    val list = set.toList()

    println("变量set的类型为：${set.javaClass}")
    println("变量list的类型为：${list.javaClass}")
    println(list[0])
}

/**
 * 集合转数组
 */
fun listToArray(){
    val list = listOf(1,2,3,4,5,6)

    val listArray = list.toIntArray()

    println("变量list的类型为：${list.javaClass}")
    println("变量listArray的类型为：${listArray.javaClass}")
    println(listArray[1])
}
 
