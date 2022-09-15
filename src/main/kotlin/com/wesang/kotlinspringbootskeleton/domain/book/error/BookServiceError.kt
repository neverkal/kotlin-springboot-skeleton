package com.wesang.kotlinspringbootskeleton.domain.book.error

import com.wesang.kotlinspringbootskeleton.common.error.BaseError

open class BookServiceError(message: String): BaseError(kotlin.String.format("Book Service Error Message : {$message}"))
