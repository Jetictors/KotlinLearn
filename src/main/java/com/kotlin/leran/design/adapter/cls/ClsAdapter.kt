package com.kotlin.leran.design.adapter.cls

/**
 * Desc           :  类适配器 适配器角色
 * Author         :  Jetictors
 * Time           :  2019-12-30  11:53
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-
 */
class ClsAdapter : ClsAdaptee(), ClsTarget{

    override fun operatorSecond(): String {
        return "class second method"
    }

    override fun operatorFirst(): String {
        return super.operatorFirst().plus("adapter success !")
    }

}