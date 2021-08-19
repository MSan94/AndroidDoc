package com.prj.androiddoc.presenter

import com.prj.androiddoc.contract.LoginContract

class LoginPresenter : LoginContract.Presenter {

    private var view : LoginContract.View? = null
    override fun setView(view: LoginContract.View) {
        this.view = view
    }

    override fun start() {
    }





}