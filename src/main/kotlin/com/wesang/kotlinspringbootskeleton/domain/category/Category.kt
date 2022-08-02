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
class Category: BaseEntity() {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null
    @NonNull var title: String? = null
    @NonNull var description: String? = null
}
