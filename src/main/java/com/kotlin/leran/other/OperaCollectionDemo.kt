package com.kotlin.leran.other

/**
 * 描述 ：    处理集合的高级函数
 * author :  Jetictors
 * time :    2018/4/1  22:59
 * version : v1.0.1
 */

class OperaCollectionDemo{


    /**
     * 生产操作符
     */
    private fun optProduce() {
        val list1 = listOf(1,2,3,4)
        val list2 = listOf("kotlin","Android","Java","PHP","JavaScript")

        // plus() 和 `+`一样
        println(list1.plus(list2))
        println(list1 + list2)

        // zip
        println(list1.zip(list2))
        println(list1.zip(list2){       // 组成的新集合由元素少的原集合决定
            it1,it2-> it1.toString().plus("-").plus(it2)
        })

        // unzip
        val newList = listOf(Pair(1,"Kotlin"),Pair(2,"Android"),Pair(3,"Java"),Pair(4,"PHP"))
        println(newList.unzip())

        // partition
        println(list2.partition { it.startsWith("Ja") })
    }

    /**
     * 过滤操作符
     */
    private fun optFilter() {

        val list1 = listOf(-1,-3,1,3,5,6,7,2,4,10,9,8)
        val list2 = listOf(1,3,4,5,null,6,null,10)
        val list3 = listOf(1,1,5,2,2,6,3,3,7,4,4,8)

        println("  ------   filter -------")
        println(list1.filter { it > 1  })
        println(list1.filterIndexed { index, result ->
            index < 5 && result > 3
        })
        println(list1.filterNot { it > 1 })
        println(list2.filterNotNull())

        println("  ------   take -------")
        println(list1.take(5))
        println(list1.takeWhile { it < 5 })
        println(list1.takeLast(5))
        println(list1.takeLastWhile { it > 5 })

        println("  ------   drop -------")
        println(list1.drop(5))
        println(list1.dropWhile { it < 5 })
        println(list1.dropLast(5))
        println(list1.dropLastWhile { it > 5 })

        println("  ------   distinct -------")
        println(list3.distinct())
        println(list3.distinctBy { it + 2 })

        println("  ------   slice -------")
        println(list1.slice(listOf(1,3,5,7)))
        println(list1.slice(IntRange(1,5)))

    }

    /**
     * 映射操作符
     */
    private fun optMapped() {
        val list1 = listOf("kotlin","Android","Java","PHP","JavaScript")

        println(list1.map { "str-".plus(it) })

        println(list1.mapNotNull { "str-".plus(it) })

        println(list1.mapIndexed { index, str ->
            index.toString().plus("-").plus(str)
        })

        println(list1.mapIndexedNotNull { index, str ->
            index.toString().plus("-").plus(str)
        })

        println( list1.flatMap { listOf(it,"new-".plus(it)) })

        println(list1.groupBy { if (it.startsWith("Java")) "big" else "latter" })

    }

    /**
     * 顺序操作符
     */
    private fun optSort() {
        val list1 = listOf(-1,-3,1,3,5,6,7,2,4,10,9,8)

        // 反序
        println(list1.reversed())

        // 升序
        println(list1.sorted())

        // 根据条件升序，即把不满足条件的放在前面，满足条件的放在后面
        println(list1.sortedBy { it % 2 == 0})

        // 降序
        println(list1.sortedDescending())

        // 根据条件降序，和`sortedBy{}`相反
        println(list1.sortedByDescending { it % 2 == 0 })

    }

    /**
     * 统计操作符
     */
    private fun optCount() {
        val list1 = listOf(1,2,3,4,5)

        println("  ------   any -------")
        // 判断是不是一个集合，若是，则在判断集合是否为空，若为空则返回`false`,反之返回true,若不是集合，则返回`hasNext`
        println(list1.any())
        // 判断集合中是否有大于10的元素。若存在则返回true,反之返回false
        println(list1.any{it > 10})

        println("  ------   all -------")
        // 判断集合中是否所有的元素都大于2。若满足条件则返回true,反之返回false
        println(list1.all { it > 2 })

        println("  ------   none -------")
        // 判断是不是一个集合，若是，则在判断集合是否为空，若为空则返回`false`,反之返回true,若不是集合，则返回`hasNext`
        println(list1.none())
        // 判断集合中是否所有的元素都大于2。若满足条件则返回true,反之返回false
        println(list1.none{ it > 2})

        println("  ------   max -------")
        println(list1.max())
        println(list1.maxBy { it + 2 })
//    println(list1.maxWith(Comparator { num1, num2 -> num1 + num2 }))

        println("  ------   min -------")
        println(list1.min())        // 返回集合中最小的元素
        println(list1.minBy { it + 2 })
//    println(list1.minWith(Comparator { num1, num2 -> num1 + num2 }))

        println("  ------   sum -------")
        println(list1.sum())
        println(list1.sumBy { it + 2 })
        println(list1.sumByDouble { it.toDouble() })

        println(" ------  average -----")
        println(list1.average())

        println("  ------   reduce  -------")
        println(list1.reduce { result, next -> result  + next})
        println(list1.reduceIndexed { index, result, next ->
            index + result + next
        })
        println(list1.reduceRight { result, next -> result  + next })
        println(list1.reduceRightIndexed {index, result, next ->
            index + result + next
        })

        println("  ------   fold  -------")
        println(list1.fold(3){result, next -> result  + next})
        println(list1.foldIndexed(3){index,result, next ->
            index + result  + next
        })
        println(list1.foldRight(3){result, next -> result  + next})
        println(list1.foldRightIndexed(3){index,result, next ->
            index + result  + next
        })
    }

    /**
     * 测试元素操作符
     */
    private fun optValue() {
        val list = listOf("kotlin","Android","Java","PHP","Python","IOS")

        println("  ------   contains -------")
        println(list.contains("JS"))

        println("  ------   elementAt -------")

        println(list.elementAt(2))
        println(list.elementAtOrElse(10,{it}))
        println(list.elementAtOrNull(10))

        println("  ------   get -------")
        println(list[2])
        println(list.getOrElse(10,{it}))
        println(list.getOrNull(10))

        println("  ------   first -------")
        println(list.first())
        println(list.first{ it == "Android" })
        println(list.firstOrNull())
        println(list.firstOrNull { it == "Android" })

        println("  ------   last -------")
        println(list.last())
        println(list.last{ it == "Android" })
        println(list.lastOrNull())
        println(list.lastOrNull { it == "Android" })

        println("  ------   indexOf -------")
        println(list.indexOf("Android"))
        println(list.indexOfFirst { it == "Android" })
        println(list.indexOfLast { it == "Android" })

        println("  ------   single -------")
        val list2 = listOf("list")
        println(list2.single())     // 只有当集合只有一个元素时，才去用这个函数，不然都会抛出异常。
        println(list2.single { it == "list" }) //当集合中的元素满足条件时，才去用这个函数，不然都会抛出异常。若满足条件返回该元素
        println(list2.singleOrNull()) // 只有当集合只有一个元素时，才去用这个函数，不然都会返回null。
        println(list2.singleOrNull { it == "list" }) //当集合中的元素满足条件时，才去用这个函数，不然返回null。若满足条件返回该元素

        println("  ------   forEach -------")
        list.forEach { println(it) }
        list.forEachIndexed { index, it -> println("index : $index \t value = $it") }

        println("  ------   componentX -------")
        println(list.component1())  // 等价于`list[0]  <=> list.get(0)`
        println(list.component2())  // 等价于`list[1]  <=> list.get(1)`
        println(list.component3())  // 等价于`list[2]  <=> list.get(2)`
        println(list.component4())  // 等价于`list[3]  <=> list.get(3)`
        println(list.component5())  // 等价于`list[4]  <=> list.get(4)`
    }

    /**
     * 获取列表或数组元素
     */
    private fun getElement() {

        val list = listOf<String>("kotlin","Android","Java","PHP","Python","IOS")
        /*
            1. 使用get(index)获取
         */
        val element1 = list[0]

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
    private fun arrayToList() {

        val arr = arrayOf(1,3,5,7,9)
        val list = arr.toList()
        println("变量arr的类型为：${arr.javaClass}")
        println("变量list的类型为：${list.javaClass}")
        println(list[1])
    }

    /**
     * 集合转集合
     */
    private fun listToList(){
        val set = setOf(1)
        val list = set.toList()

        println("变量set的类型为：${set.javaClass}")
        println("变量list的类型为：${list.javaClass}")
        println(list[0])
    }

    /**
     * 集合转数组
     */
    private fun listToArray(){
        val list = listOf(1,2,3,4,5,6)

        val listArray = list.toIntArray()

        println("变量list的类型为：${list.javaClass}")
        println("变量listArray的类型为：${listArray.javaClass}")
        println(listArray[1])
    }

    fun test(){
        listToArray()
        arrayToList()
        listToList()
        getElement()
        optValue()
        optCount()
        optSort()
        optMapped()
        optFilter()
        optProduce()
    }

}
 
