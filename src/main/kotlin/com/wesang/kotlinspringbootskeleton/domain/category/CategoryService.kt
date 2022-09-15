package com.wesang.kotlinspringbootskeleton.domain.category

interface CategoryService {
    fun getCategory(id: Long): Category
    fun registerCategory(name: String)
}
