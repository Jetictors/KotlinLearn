package com.kotlin.leran.design.factory.method.demo2

/**
 * Desc           :  具体工厂角色（美国手机工厂）
 * Author         :  Jetictors
 * Time           :  2019-12-27  15:01
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class AmericaFactory : IPhoneFactory{

    override fun createPhone(type : String, time : String): IPhone {
        return ApplePhone(type, time)
    }

}
