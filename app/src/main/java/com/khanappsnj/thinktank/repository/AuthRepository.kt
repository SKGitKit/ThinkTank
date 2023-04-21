package com.khanappsnj.thinktank.repository

interface AuthRepository {
    suspend fun signUp(email: String, password: String): Result<User>
    suspend fun login(email: String, password: String): Result<User>
    suspend fun logout(): Result<Unit>
}

class User {

}
