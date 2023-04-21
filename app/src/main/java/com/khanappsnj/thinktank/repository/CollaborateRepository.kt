package com.khanappsnj.thinktank.repository

import com.khanappsnj.thinktank.data.model.Iteration
import com.khanappsnj.thinktank.data.model.Problem
import com.khanappsnj.thinktank.data.model.Solution

interface CollaborateRepository {
    suspend fun getProblems(): Result<List<Problem>>
    suspend fun createProblem(problem: Problem): Result<Problem>
    suspend fun getIterations(problemId: String): Result<List<Iteration>>
    suspend fun createIteration(iteration: Iteration): Result<Iteration>
    suspend fun getSolutions(problemId: String): Result<List<Solution>>
    suspend fun createSolution(solution: Solution): Result<Solution>
}