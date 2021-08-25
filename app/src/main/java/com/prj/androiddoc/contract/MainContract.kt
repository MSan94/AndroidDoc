package com.prj.androiddoc.contract

import com.prj.androiddoc.BasePresenter
import com.prj.androiddoc.BaseView

/**
 * @author 안명성
 * @since 2021.08.24
 */
interface MainContract {

    interface View : BaseView<Presenter> {
        fun initFragment();
    }

    interface Presenter : BasePresenter {
    }

}