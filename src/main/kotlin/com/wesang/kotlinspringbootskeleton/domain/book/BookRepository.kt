package com.wesang.kotlinspringbootskeleton.domain.book

import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository: JpaRepository<Book, Long>, BookSupport
