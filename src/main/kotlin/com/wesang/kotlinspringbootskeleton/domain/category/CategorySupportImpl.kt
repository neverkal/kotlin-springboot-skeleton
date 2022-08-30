package com.wesang.kotlinspringbootskeleton.domain.category

import com.querydsl.jpa.impl.JPAQueryFactory
import com.wesang.kotlinspringbootskeleton.domain.CustomQuerydslRepositorySupport
import com.wesang.kotlinspringbootskeleton.domain.category.QCategory.category

class CategorySupportImpl(
    private val query: JPAQueryFactory,
) : CustomQuerydslRepositorySupport(Category::class.java), CategorySupport {

    override fun getCategories(): List<Category> {
        return query.selectFrom(category).fetch()
    }
}
