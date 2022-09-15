package com.wesang.kotlinspringbootskeleton.domain.book

import com.wesang.kotlinspringbootskeleton.common.exception.NoContentException
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.Optional

@Service
class BookServiceImpl(
    private val bookRepository: BookRepository
): BookService {

    @Transactional(readOnly = true)
    override fun getBook(id: Long): Book {
        val optionalBookEntity: Optional<Book> = bookRepository.findById(id)
        if (optionalBookEntity.isPresent) {
            return optionalBookEntity.get()
        }

        throw NoContentException("조회 요청하신 {$id}는 없습니다.")
    }

    override fun registerBook(name: String) {
        TODO("Not yet implemented")
    }

}
