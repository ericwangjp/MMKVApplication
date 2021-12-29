package com.example.mmkvapplication

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 *
 * -----------------------------------------------------------------
 * Copyright (C) 2021, by Sumpay, All rights reserved.
 * -----------------------------------------------------------------
 * desc: MMKVBoolProperty
 * Author: wangjp
 * Email: wangjp1@fosun.com
 * Version: Vx.x.x
 * Create: 2021/12/29 10:19 上午
 *
 */
class MMKVBoolProperty : ReadWriteProperty<MMKVOwner, Boolean> {
    override fun getValue(thisRef: MMKVOwner, property: KProperty<*>): Boolean =
        thisRef.kv.decodeBool(property.name)

    override fun setValue(thisRef: MMKVOwner, property: KProperty<*>, value: Boolean) {
        thisRef.kv.encode(property.name, value)
    }
}

//注意thisRef的类型是故意定为MMKVOwner而不是Any?，也就是说必须实现了MMKVOwner接口才能使用MMKV属性委托