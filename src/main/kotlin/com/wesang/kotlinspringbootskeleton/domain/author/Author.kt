package com.wesang.kotlinspringbootskeleton.domain.author

import com.wesang.kotlinspringbootskeleton.common.entity.BaseEntity
import com.wesang.kotlinspringbootskeleton.domain.book.Book
import lombok.*
import java.util.TreeSet
import javax.persistence.*

@Entity
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor
@Builder
@Getter
class Author: BaseEntity() {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null
    @NonNull var name: String? = null
    @OneToMany(mappedBy = "author") var books: MutableSet<Book> = TreeSet()
}
