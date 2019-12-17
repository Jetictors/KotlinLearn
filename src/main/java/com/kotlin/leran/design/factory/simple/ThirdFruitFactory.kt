package com.kotlin.leran.design.factory.simple

/**
 * Desc           :  静态工厂方法模式
 * Author         :  Jetictors
 * Time           :  2019-12-17  16:41
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class ThirdFruitFactory{

    companion object{
        /**
         * 创建苹果
         */
        fun createApple() : IFruit{
            return Apple("green", 8.8)
        }

        /**
         * 创建香蕉
         */
        fun createBanana() : IFruit{
            return Banana(5.5)
        }

        /**
         * 创建葡萄
         */
        fun createGrape() : IFruit{
            return Grape(true, 12.8)
        }
    }

}
