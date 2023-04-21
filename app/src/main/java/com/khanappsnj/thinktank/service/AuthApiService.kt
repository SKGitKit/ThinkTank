package com.khanappsnj.thinktank.service

interface AuthApiService {
    @POST("auth/login")
    suspend fun login(@Body loginRequest: LoginRequest): Response<LoginResponse>

    @POST("auth/signup")
    suspend fun signup(@Body signupRequest: SignupRequest): Response<SignupResponse>

    @POST("auth/logout")
    suspend fun logout(): Response<Unit>
}