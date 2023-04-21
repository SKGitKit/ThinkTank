package com.khanappsnj.thinktank.repository

import com.khanappsnj.thinktank.data.model.Problem
import com.khanappsnj.thinktank.service.CollaborateApiService

class CollaborateRepositoryImpl(private val collaborateApiService: CollaborateApiService) : CollaborateRepository {
    override suspend fun getProblems(): Result<List<Problem>> {
        return try {
            val response = collaborateApiService.getProblems()
            if (response.isSuccessful) {
                val problems = response.body()
                if (problems != null) {
                    Result.success(problems)
                } else {
                    Result.failure(Exception("Response body is null"))
                }
            } else {
                Result.failure(Exception("Response not successful"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    override suspend fun createProblem(problem: Problem): Result<Problem> {
        return try {
            val response = collaborateApiService.createProblem(problem)
            if (response.isSuccessful) {
                val createdProblem = response.body()
                if (createdProblem != null) {
                    Result.success(createdProblem)
                } else {
                    Result.failure(Exception("Response body is null"))
                }
            } else {
                Result.failure(Exception("Response not successful"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    override suspend fun getIterations(problemId: String): Result<List<Iteration>> {
        return try {
            val response = collaborateApiService.getIterations(problemId)
            if (response.isSuccessful) {
                val iterations = response.body()
                if (iterations != null) {
                    Result.Success(iterations)
                } else {
                    Result.Error(Exception("Response body is null"))
                }
            } else {
                Result.Error(Exception("Response not successful"))
            }
        } catch (e: Exception) {
            Result.Error(e)
        }
    }

    override suspend fun createIteration(iteration: Iteration): Result<Iteration> {
        return try {
            val response = collaborateApiService.createIteration(iteration)
            if (response.isSuccessful) {
                val createdIteration = response.body()
                if (createdIteration != null) {
                    Result.Success(createdIteration)
                } else {
                    Result.Error(Exception("Response body is null"))
                }
            } else {
                Result.Error(Exception("Response not successful"))
            }
        } catch (e: Exception) {
            Result.Error(e)
        }
    }

    override suspend fun getSolutions(problemId: String): Result<List<Solution>> {
        return try {
            val response = collaborateApiService.getSolutions(problemId)
            if (response.isSuccessful) {
                val solutions = response.body()
                if (solutions != null) {
                    Result.Success(solutions)
                } else {
                    Result.Error(Exception("Response body is null"))
                }
            } else {
                Result.Error(Exception("Response not successful"))
            }
        } catch (e: Exception) {
            Result.Error(e)
        }
    }

    override suspend fun createSolution(solution: Solution): Result<Solution> {
        return try {
            val response = collaborateApiService.createSolution(solution)
            if (response.isSuccessful) {
                val createdSolution = response.body()
                if (createdSolution != null) {
                    Result.Success(createdSolution)
                } else {
                    Result.Error(Exception("Response body is null"))
                }
            } else {
                Result.Error(Exception("Response not successful"))
            }
        } catch (e: Exception) {
            Result.Error(e)
        }
    }
}