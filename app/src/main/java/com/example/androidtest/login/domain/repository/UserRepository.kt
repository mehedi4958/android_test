package com.example.androidtest.login.domain.repository

import com.example.androidtest.login.domain.model.User

interface UserRepository {
   suspend fun getData(): List<User>
}
