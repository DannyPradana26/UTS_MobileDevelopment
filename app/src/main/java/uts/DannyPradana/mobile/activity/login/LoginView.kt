package uts.DannyPradana.mobile.activity.login

import uts.DannyPradana.mobile.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}