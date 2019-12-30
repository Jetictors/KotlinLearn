package com.kotlin.leran.cls

/**
 * 描述 ：    类型别名讲解
 * author :  Jetictors
 * time :    2019/3/16  17:49
 * version : 1.0.1
 */

typealias First = TypeAliasDemoTestFirst
typealias Second = TypeAliasDemoTestSecond

typealias NestA = DemoClassTestNest.A
typealias NestB = DemoClassTestNest.B

typealias InnerA = DemoClassTestInner.A
typealias InnerB = DemoClassTestInner.B

typealias MutListData = MutableList<MutableList<Int>>
typealias MapModelData<T> = MutableMap<String, BaseModel<T>>

// 定义一个返回值为Boolean类型的函数为另一个函数的参数，把这个函数参数定义为`Predicate<T>`的别名
typealias Predicate<T> = (T) -> Boolean

// 定义的高阶函数
fun foo1(p : Predicate<Int>) = p(2)
fun foo2(p : Predicate<String>) = p("demo1")

class DemoClassTestNest{
    class A{
        fun show(){
            println("name : ${this.javaClass.simpleName}")
        }
    }

    class B{
        fun show(){
            println("name : ${this.javaClass.simpleName}")
        }
    }
}

class DemoClassTestInner{
    class A{
        fun show(){
            println("name : ${this.javaClass.simpleName}")
        }
    }

    class B{
        fun show(){
            println("name : ${this.javaClass.simpleName}")
        }
    }}

class TypeAliasDemoTestFirst{
    fun show(){
        println("name : ${this.javaClass.simpleName}")
    }
}

class TypeAliasDemoTestSecond{
    fun show(){
        println("name : ${this.javaClass.simpleName}")
    }
}

data class TestBean(val id : Int,
                    val name : String,
                    val `package` : String)

data class BaseModel<T>(val code : Int,
                        val msg : String,
                        val data : T){
    override fun toString(): String {
        return "BaseModel(code=$code, msg='$msg', data=$data)"
    }
}

class TypealiasDemo {

    fun test() {
        val first = First()
        first.show()

        val second = Second()
        second.show()

        val nestA = NestA()
        nestA.show()

        val nestB = NestB()
        nestB.show()

        val innerA = InnerA()
        innerA.show()

        val innerB = InnerB()
        innerB.show()

        val data: MutListData = mutableListOf()
        val item1 = mutableListOf(1, 3, 5, 7)
        val item2 = mutableListOf(2, 4, 6, 8)
        data.add(item1)
        data.add(item2)

        data.asSequence().flatMap { it.asSequence() }.forEach { print("value : $it \t") }

        val dataModel: MapModelData<Int> = mutableMapOf()
        val model1 = BaseModel<Int>(1, "demo1 1", 1)
        val model2 = BaseModel<Int>(2, "test2", 2)
        dataModel.put("1", model1)
        dataModel.put("2", model2)

        dataModel.forEach { key, value ->
            println("key : $key value : ${value.toString()}")
        }

        // 条件，即函数参数为{it > 0}，返回值时Boolean类型，其这里的it指的就是泛型T，确定为了Int型
        val f1: (Int) -> Boolean = { it > 0 }
        // 即把2带入foo1函数中，经过上面的条件，判断出 2 > 0 故而应该输出为true
        println(foo1(f1))

        val f2: (String) -> Boolean = { it == "xxx" }
        println(foo2(f2)) //这里输出为false, 很显然，"demo1" != "xxx"
    }

}