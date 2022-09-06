package com.wesang.kotlinspringbootskeleton.domain.author

import mu.KotlinLogging
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Validated
@RestController
@RequestMapping("/api/authors")
class AuthorController(
    private val authorService: AuthorService
) {
    private val logger = KotlinLogging.logger {}

    @GetMapping("/{authorId}")
    fun getAuthorDetail (
        @PathVariable("authorId") authorId: Long
    ): Author {
        return authorService.getAuthor(authorId)
    }

}
