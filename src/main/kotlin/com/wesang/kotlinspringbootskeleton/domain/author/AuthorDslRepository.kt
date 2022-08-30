package com.wesang.kotlinspringbootskeleton.domain.author

interface AuthorDslRepository {
    fun selectByStartAndLimitAtDsl(startIdx: Int, limitCnt: Int): List<Author>
}
