package com.wesang.kotlinspringbootskeleton.domain.author

import com.wesang.kotlinspringbootskeleton.common.exception.NoContentException
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.Optional

@Service
class AuthorServiceImpl(
    private val authorRepository: AuthorRepository
): AuthorService {

    @Transactional(readOnly = true)
    override fun getAuthor(id: Long): Author {
        val optionalAuthorEntity: Optional<Author> = authorRepository.findById(id)
        if (optionalAuthorEntity.isPresent) {
            return optionalAuthorEntity.get()
        }
        throw NoContentException("조회 요청하신 {$id}는 없습니다.")
    }

    override fun registerAuthor(name: String) {
        TODO("Not yet implemented")
    }

}
