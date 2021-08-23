package com.prj.androiddoc.contract

import com.prj.androiddoc.BasePresenter
import com.prj.androiddoc.BaseView

interface MainContract {

    interface View : BaseView<Presenter> {
        fun initFragment();
    }

    interface Presenter : BasePresenter {
    }

}