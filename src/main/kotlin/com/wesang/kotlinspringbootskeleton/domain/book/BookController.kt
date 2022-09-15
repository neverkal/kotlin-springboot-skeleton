package com.wesang.kotlinspringbootskeleton.domain.book

import com.wesang.kotlinspringbootskeleton.domain.author.AuthorService
import mu.KotlinLogging
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Validated
@RestController
@RequestMapping("/api/books")
class BookController(
    private val bookService: BookService
) {
    private val logger = KotlinLogging.logger {}

    @GetMapping("/{bookId}")
    fun getBookDetail(
        @PathVariable("bookId") bookId: Long
    ): Book {
        return bookService.getBook(bookId)
    }
}
