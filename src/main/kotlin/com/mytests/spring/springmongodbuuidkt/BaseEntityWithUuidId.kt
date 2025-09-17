package com.mytests.spring.springmongodbuuidkt

import org.springframework.data.annotation.Id
import java.util.*

abstract class BaseEntityWithUuidId {
    @Id
    var id: UUID? = null

    fun defineId(id: UUID?) {
        if (this.id != null) {
            throw UnsupportedOperationException("ID already set")
        }

        this.id = id
    }


}