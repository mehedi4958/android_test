package com.example.androidtest.login.data.repository

import com.example.androidtest.login.data.mapper.toUser
import com.example.androidtest.login.data.remote.LoginApi
import com.example.androidtest.login.domain.model.User
import com.example.androidtest.login.domain.repository.UserRepository

class UserRepositoryImpl(val api: LoginApi): UserRepository {
    override suspend fun getData(): List<User> {
return  api.getData().map { it.toUser() }
    }
}
