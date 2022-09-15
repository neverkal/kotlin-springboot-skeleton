package com.wesang.kotlinspringbootskeleton.domain.book

interface BookService {
    fun getBook(id: Long): Book
    fun registerBook(name: String)
}
