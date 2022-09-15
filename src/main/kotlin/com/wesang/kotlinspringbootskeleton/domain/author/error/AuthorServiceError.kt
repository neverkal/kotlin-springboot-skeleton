package com.wesang.kotlinspringbootskeleton.domain.author.error

import com.wesang.kotlinspringbootskeleton.common.error.BaseError

open class AuthorServiceError(message: String): BaseError(kotlin.String.format("Author Service Error Message : {$message}"))
