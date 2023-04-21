package com.khanappsnj.thinktank.service

interface CollaborateApiService {
    @GET("problems")
    suspend fun getProblems(): Response<List<Problem>>

    @POST("problems")
    suspend fun createProblem(@Body problem: Problem): Response<Problem>

    @GET("problems/{problemId}/iterations")
    suspend fun getIterations(@Path("problemId") problemId: String): Response<List<Iteration>>

    @POST("problems/{problemId}/iterations")
    suspend fun createIteration(@Path("problemId") problemId: String, @Body iteration: Iteration): Response<Iteration>

    @GET("problems/{problemId}/solutions")
    suspend fun getSolutions(@Path("problemId") problemId: String): Response<List<Solution>>

    @POST("problems/{problemId}/solutions")
    suspend fun createSolution(@Path("problemId") problemId: String, @Body solution: Solution): Response<Solution>
}