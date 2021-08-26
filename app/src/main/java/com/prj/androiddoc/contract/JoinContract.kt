package com.prj.androiddoc.contract

import com.prj.androiddoc.BasePresenter
import com.prj.androiddoc.BaseView

interface JoinContract {

    interface View : BaseView<Presenter> {
    }

    interface Presenter : BasePresenter {
    }

}