package com.example.mmkvapplication

import android.content.Context
import androidx.startup.Initializer
import com.tencent.mmkv.MMKV

/**
 *
 * -----------------------------------------------------------------
 * Copyright (C) 2021, by Sumpay, All rights reserved.
 * -----------------------------------------------------------------
 * desc: MMKVInitializer
 * Author: wangjp
 * Email: wangjp1@fosun.com
 * Version: Vx.x.x
 * Create: 2021/12/29 10:09 上午
 *
 */
class MMKVInitializer : Initializer<Unit> {
    override fun create(context: Context) {
       MMKV.initialize(context)
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        TODO("Not yet implemented")
//        override fun dependencies() = emptyList<Class<Initializer<*>>>()
    }
}