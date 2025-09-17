package com.mytests.spring.springmongodbuuidkt

import org.springframework.data.mongodb.core.mapping.event.BeforeConvertCallback
import org.springframework.stereotype.Component
import java.util.*

@Component
class UuidCallback : BeforeConvertCallback<BaseEntityWithUuidId> {
    override fun onBeforeConvert(entity: BaseEntityWithUuidId, collection: String): BaseEntityWithUuidId {
        if (entity.id == null) {
            entity.defineId(UUID.randomUUID())
        }
        return entity
    }
}
