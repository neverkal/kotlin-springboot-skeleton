package com.wesang.kotlinspringbootskeleton.domain.author

interface AuthorService {
    fun getAuthor(id: Long): Author
    fun registerAuthor(name: String)
}
