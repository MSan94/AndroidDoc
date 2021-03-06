package com.prj.androiddoc.contract

import com.prj.androiddoc.BasePresenter
import com.prj.androiddoc.BaseView

/**
 * @author 안명성
 * @since 2021.08.24
 */
interface LoginContract {

    interface View : BaseView<Presenter>{
        fun showToast(type : Int)
        fun ToastString(msg : String)
    }

    interface Presenter : BasePresenter{
        fun setView(view : View)
        fun checkMatch(id:String,pw:String) : Boolean
    }

}