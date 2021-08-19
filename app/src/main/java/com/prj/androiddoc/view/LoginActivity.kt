package com.prj.androiddoc.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.prj.androiddoc.R
import com.prj.androiddoc.contract.LoginContract
import com.prj.androiddoc.databinding.ActivityLoginBinding
import com.prj.androiddoc.presenter.LoginPresenter
import com.prj.androiddoc.string.PropertiesString

/**
 * @author 안명성
 * @since 2021.08.20
 * Type
 * 1 -> 아이디 미입력 & 올바르지 않은 아이디
 * 2 -> 패스워드 미입력 & 올바르지 않은 패스워드
 * 3 -> 아이디 / 패스워드 미일치
 * 4 -> 로그인 성공 ( 회원 )
 * 5 -> 로그인 성공 ( 게스트 )
 */

class LoginActivity() : AppCompatActivity(), LoginContract.View {
    val binding by lazy { ActivityLoginBinding.inflate(layoutInflater) }

    override lateinit var presenter: LoginContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        presenter = LoginPresenter()
        presenter.setView(this)

        binding.btnTest.setOnClickListener { showToast(1) }
    }


    override fun showToast(type: Int) {
        var properties = PropertiesString()
        when(type){
            1 -> ToastString(properties.login_Error_Id)
            2 -> ToastString(properties.login_Error_Pw)
            3 -> ToastString(properties.login_Error_Match)
            4 -> ToastString(properties.login_Success_User)
            5 -> ToastString(properties.login_Success_Guest)
        }
    }

    override fun ToastString(msg: String) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
    }


}