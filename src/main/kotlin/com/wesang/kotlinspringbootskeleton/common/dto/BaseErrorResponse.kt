package com.wesang.kotlinspringbootskeleton.common.dto

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.RequiredArgsConstructor

@AllArgsConstructor
@Getter
open class BaseErrorResponse(var errorCode: Long, var errorMessage: String)
