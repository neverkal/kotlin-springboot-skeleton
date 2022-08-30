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
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long,
    @NonNull var title: String,
    @NonNull var content: String,
    @NonNull var publishAt: LocalDateTime,
    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "category_id") var category: Category,
    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "author_id") var author: Author
): BaseEntity() {
}
