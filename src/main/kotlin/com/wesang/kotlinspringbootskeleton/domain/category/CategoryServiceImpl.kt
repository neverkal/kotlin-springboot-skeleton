package com.wesang.kotlinspringbootskeleton.domain.category

import com.wesang.kotlinspringbootskeleton.common.exception.NoContentException
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.Optional

@Service
class CategoryServiceImpl(
    private val categoryRepository: CategoryRepository
): CategoryService {

    @Transactional(readOnly = true)
    override fun getCategory(id: Long): Category {
        val optionalCategory: Optional<Category> = categoryRepository.findById(id)
        if (optionalCategory.isPresent) {
            return optionalCategory.get()
        }

        throw NoContentException("조회 요청하신 {$id}는 없습니다.")
    }

    override fun registerCategory(name: String) {
        TODO("Not yet implemented")
    }

}
