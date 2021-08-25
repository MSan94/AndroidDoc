package com.prj.androiddoc.presenter

import android.util.Log
import com.prj.androiddoc.contract.LoginContract

/**
 * @author 안명성
 * @since 2021.08.24
 */
class LoginPresenter : LoginContract.Presenter {

    private var view : LoginContract.View? = null
    override fun setView(view: LoginContract.View) {
        this.view = view
    }

    override fun checkMatch(id: String, pw: String) : Boolean {
        return id == "test" && pw == "qwer"
    }

    override fun start() {
    }





}