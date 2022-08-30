package com.wesang.kotlinspringbootskeleton.domain.book

import org.springframework.data.jpa.repository.JpaRepository

interface BookDslRepository {
    fun selectByStartAndLimitAtDsl(startIdx: Int, limitCnt: Int): List<Book>
}
