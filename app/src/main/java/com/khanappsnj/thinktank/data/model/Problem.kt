package com.khanappsnj.thinktank.data.model

data class Problem(
    val id: String = "",
    val title: String = "",
    val description: String = "",
    val imageUrl: String = "",
    val createdDate: Long = 0L,
    val active: Boolean = false,
    val solutions: List<Solution> = emptyList()
)