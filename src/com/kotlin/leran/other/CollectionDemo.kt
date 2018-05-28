package com.kotlin.leran.other

/**
 * 描述 ：    集合详解
 * anthor :  Jetictors
 * time :    2018/3/25  22:16
 * version : v1.0.1
 */

fun main(args: Array<String>) {

    listDemo()
    mutableListDemo()
    setDemo()
    mapDemo()
}

fun mapDemo() {

    val emptyMap = emptyMap<Int,String>()
    val sortedMap = sortedMapOf<Int,String>()
    val map1 = mapOf("key1" to 2 , "key1" to 3)
    val map2 = mapOf<Int,String>(1 to "value1" , 2 to "value2")
    val mutableMap = mutableMapOf("key1" to 2 , "key1" to 3)
    val hashMap = hashMapOf("key1" to 2 , "key1" to 3)

    map2.forEach{
        key,value -> println("$key \t $value")
    }

    val map = mapOf("key1" to 2 , "key1" to 3 , "key1" to "value1" , "key2" to "value2")

    map.forEach{
        key,value -> println("$key \t $value")
    }
}

fun setDemo() {
    val emptySet = emptySet<Int>()
    val hashSet = hashSetOf<Int>()
    val sortedSet = sortedSetOf<Int>()
    val set1 = setOf(1,2,"3","4","2",1,2,3,4,5)
    val mutableSet1 = mutableSetOf(1,2,"3","4","2",1,2,3,4,5)

    for (value in set1){
        print("$value \t")
    }

    println("\n")
}

private fun listDemo(){
    val emptyArray = emptyArray<Int>()  // 创建空数组
    val arr = arrayOf("1",2,3,4)

    for (index in arr){
        print("$index \t")
    }

    arr.forEach {  }

    arr.reverse()
    for (any in arr) {
        print("$any \t")
    }
    val emptyList = emptyList<Int>() // 创建空List
    val list1 = listOf(1,2,2,4,5)
    val list2 = listOf(arr)
    val list3 = listOf<String>("1","2","3","4","5")

    val list : ArrayList<String>  // 这里的ArrayList<>和Java里面的ArrayList<>一致

    for (index in list1){
        print("$index \t")
    }

    println("\n")

    // 集合协变
    open class Person(val name : String , val age : Int){
        override fun toString(): String {
            return "Person(name='$name', age=$age)"
        }
    }

    class Student(name: String, age : Int, cls : String) : Person(name, age)

    var listPerson: List<Any>
    val listStudent : List<Student> = listOf(Student("张三",12,"一班"),Student("王五",20,"二班"))
    listPerson = listStudent

    listPerson.forEach { println(it.toString()) }

    var mutableListPerson: MutableList<Person>
    val mutableListStudent : List<Student> = listOf(Student("张三",12,"一班"),Student("王五",20,"二班"))
    mutableListPerson = mutableListStudent.toMutableList()
    mutableListPerson.add(Person("a",15))
    mutableListPerson.add(Person("b",45))

    mutableListPerson.forEach { println(it.toString()) }
}


private fun mutableListDemo(){
    val arr = arrayOf("1",2,3,4)
    val mutableList1 = mutableListOf(1,2,"3",4,"5")                // 随意创建
    val mutableList2 = mutableListOf<String>("1","2","3","4","5")  // 确定元素的值类型
    val mutableList3 = mutableListOf(arr)                          // 可传入一个数组
    val mutableList : ArrayList<String>  // 这里的ArrayList<>和Java里面的ArrayList一致

    mutableList1.add("6")  // 添加元素
    mutableList1.add("7")
    mutableList1.remove(1)   // 删除某一元素

    // 遍历
    for(index in mutableList1){
        print("$index \t")
    }

    mutableList1.clear()   // 清空集合

    println("\n")
}