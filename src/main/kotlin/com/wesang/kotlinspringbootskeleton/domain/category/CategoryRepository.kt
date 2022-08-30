package com.wesang.kotlinspringbootskeleton.domain.category

import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepository: JpaRepository<Category, Long>, CategorySupport
