package com.example.androidtest.login.data.mapper

import com.example.androidtest.login.domain.model.User
import  com.example.androidtest.login.data.remote.UserDto

fun  UserDto.toUser(): User{
    return  User(name = name ?: "not")
}
