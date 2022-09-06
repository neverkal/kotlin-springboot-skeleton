package com.wesang.kotlinspringbootskeleton.common.config

import com.wesang.kotlinspringbootskeleton.common.api_docs.BadRequestResponse
import com.wesang.kotlinspringbootskeleton.common.exception.NoContentException
import mu.KotlinLogging
import org.springframework.http.HttpStatus
import org.springframework.web.HttpMediaTypeNotSupportedException
import org.springframework.web.HttpRequestMethodNotSupportedException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.servlet.NoHandlerFoundException
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import javax.validation.ConstraintViolationException

@RestControllerAdvice
class GlobalControllerAdvice {
    private val logger = KotlinLogging.logger {}

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ExceptionHandler(NoContentException::class)
    fun noContentException(response: HttpServletResponse, ex: NoContentException) {
        logger.info { "204 NO_CONTENT : ${ex.javaClass.name}" }
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ConstraintViolationException::class)
    fun badRequestException(response: HttpServletResponse, ex: ConstraintViolationException): BadRequestResponse {
        return BadRequestResponse(listOf(ex.message) as List<String>)
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NoHandlerFoundException::class)
    fun notFoundException(request: HttpServletRequest, ex: NoHandlerFoundException) {
        logger.info { "404 NOT_FOUND : ${ex.javaClass.name}" }
    }

    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    @ExceptionHandler(HttpRequestMethodNotSupportedException::class)
    fun methodNotAllowedException(response: HttpServletResponse, ex: HttpRequestMethodNotSupportedException) {
        logger.info { "405 METHOD_NOT_ALLOWED : ${ex.javaClass.name}" }
    }

    @ResponseStatus(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
    @ExceptionHandler(HttpMediaTypeNotSupportedException::class)
    fun unsupportedMediaType(response: HttpServletResponse, ex: HttpMediaTypeNotSupportedException) {
        logger.info { "415 UNSUPPORTED_MEDIA_TYPE : ${ex.javaClass.name}" }
    }
}
