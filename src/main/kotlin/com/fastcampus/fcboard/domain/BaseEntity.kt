package com.fastcampus.fcboard.domain

import jakarta.persistence.MappedSuperclass
import java.time.LocalDateTime

// @MappedSuperclass 선언으로 BaseEntity class를 상속받는 class에 대한 영향을 알아보기
@MappedSuperclass
abstract class BaseEntity(
    createdBy: String
) {
    val createdBy: String = createdBy
    val createdAt: LocalDateTime = LocalDateTime.now()
    var updatedBy: String? = null
        protected set
    var updatedAt: LocalDateTime? = null
        protected set

    fun update(updatedBy: String) {
        this.updatedBy = updatedBy
        this.updatedAt = LocalDateTime.now()
    }
}
