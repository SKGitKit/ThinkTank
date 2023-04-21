package com.khanappsnj.thinktank.data.model

data class Solution(
    val id: String = "",
    val problemId: String = "",
    val userId: String = "",
    val imageUrl: String = "",
    val description: String = "",
    val severity: Int = 0,
    val createdDate: Long = 0L,
    val completed: Boolean = false,
    val needsPolice: Boolean = false
)