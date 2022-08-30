package com.wesang.kotlinspringbootskeleton.domain.author

import com.querydsl.jpa.impl.JPAQueryFactory
import com.wesang.kotlinspringbootskeleton.domain.CustomQuerydslRepositorySupport
import com.wesang.kotlinspringbootskeleton.domain.author.QAuthor.author

class AuthorSupportImpl(
    private val query: JPAQueryFactory,
) : CustomQuerydslRepositorySupport(Author::class.java), AuthorSupport {

    override fun getAuthors(): List<Author> {
        return query.selectFrom(author).fetch()
    }
}
