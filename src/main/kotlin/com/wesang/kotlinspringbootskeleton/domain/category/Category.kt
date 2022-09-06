package com.wesang.kotlinspringbootskeleton.domain.category

import com.wesang.kotlinspringbootskeleton.common.entity.BaseEntity
import lombok.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor
@Builder
@Getter
open class Category(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) open var id: Long,
    @NonNull open var title: String,
    @NonNull open var description: String
): BaseEntity() {
}
