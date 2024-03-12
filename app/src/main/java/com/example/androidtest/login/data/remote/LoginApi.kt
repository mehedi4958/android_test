package com.example.androidtest.login.data.remote

import com.example.androidtest.login.domain.model.User

interface LoginApi {
fun  getData(): List<UserDto>
}
