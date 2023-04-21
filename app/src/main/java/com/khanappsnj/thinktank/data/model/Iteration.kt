package com.khanappsnj.thinktank.data.model

data class Iteration(
    val id: String = "",
    val problemId: String = "",
    val startDate: Long = 0L,
    val endDate: Long = 0L,
    val active: Boolean = false
)
