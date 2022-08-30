package com.wesang.kotlinspringbootskeleton.domain.book

import com.querydsl.jpa.impl.JPAQueryFactory
import com.wesang.kotlinspringbootskeleton.domain.CustomQuerydslRepositorySupport
import com.wesang.kotlinspringbootskeleton.domain.book.QBook.book

class BookSupportImpl(
    private val query: JPAQueryFactory,
) : CustomQuerydslRepositorySupport(Book::class.java), BookSupport {

    override fun getBooks(): List<Book> {
        return query.selectFrom(book).fetch()
    }
}
