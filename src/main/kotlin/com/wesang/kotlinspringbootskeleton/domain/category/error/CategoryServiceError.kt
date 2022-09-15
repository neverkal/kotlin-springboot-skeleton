package com.wesang.kotlinspringbootskeleton.domain.category.error

import com.wesang.kotlinspringbootskeleton.common.error.BaseError

open class CategoryServiceError(message: String) : BaseError(kotlin.String.format("Category Service Error Message : {$message"))
