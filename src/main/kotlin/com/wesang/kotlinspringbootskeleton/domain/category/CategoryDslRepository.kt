package com.wesang.kotlinspringbootskeleton.domain.category

interface CategoryDslRepository {
    fun selectByStartAndLimitAtDsl(startIdx: Int, limitCnt: Int): List<Category>
}
