package com.example.mmkvapplication

/**
 *
 * -----------------------------------------------------------------
 * Copyright (C) 2021, by Sumpay, All rights reserved.
 * -----------------------------------------------------------------
 * desc: DataRepository
 * Author: wangjp
 * Email: wangjp1@fosun.com
 * Version: Vx.x.x
 * Create: 2021/12/29 10:24 上午
 *
 */
object DataRepository : MMKVOwner {
    var isDarkMode: Boolean by MMKVBoolProperty()
}


//// 读取数据
//if (DataRepository.isDarkMode) {
//    ...
//}
//
//// 缓存数据
//DataRepository.isDarkMode = true