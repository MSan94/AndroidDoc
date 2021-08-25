package com.prj.androiddoc

/**
 * @author 안명성
 * @since 2021.08.23
 */
interface BaseView<T> {
    var presenter : T
    fun init()
}