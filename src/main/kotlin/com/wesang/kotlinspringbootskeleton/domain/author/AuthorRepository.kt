package com.wesang.kotlinspringbootskeleton.domain.author

import org.springframework.data.jpa.repository.JpaRepository

interface AuthorRepository: JpaRepository<Author, Long>, AuthorSupport
