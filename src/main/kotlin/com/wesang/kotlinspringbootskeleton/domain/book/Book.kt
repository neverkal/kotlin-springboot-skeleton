package com.wesang.kotlinspringbootskeleton.domain.book

import com.wesang.kotlinspringbootskeleton.common.entity.BaseEntity
import com.wesang.kotlinspringbootskeleton.domain.author.Author
import com.wesang.kotlinspringbootskeleton.domain.category.Category
import lombok.AccessLevel
import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.NonNull
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor
@Builder
@Getter
class Book: BaseEntity() {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null
    @NonNull var title: String? = null
    @NonNull var content: String? = null
    @NonNull var publishAt: LocalDateTime? = null
    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "category_id") var category: Category? = null
    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "author_id") var author: Author? = null
}
