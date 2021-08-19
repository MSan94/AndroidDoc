package com.prj.androiddoc.contract

import com.prj.androiddoc.BasePresenter
import com.prj.androiddoc.BaseView

interface LoginContract {

    interface View : BaseView<Presenter>{
        fun showToast(type : Int)
        fun ToastString(msg : String)
    }

    interface Presenter : BasePresenter{
        fun setView(view : View)
    }

}