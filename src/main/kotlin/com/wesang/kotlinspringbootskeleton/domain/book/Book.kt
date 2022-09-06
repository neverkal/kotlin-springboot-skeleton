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
open class Book(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) open var id: Long,
    @NonNull open var title: String,
    @NonNull open var content: String,
    @NonNull open var publishAt: LocalDateTime,
    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "category_id") open var category: Category,
    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "author_id") open var author: Author
): BaseEntity() {
}
