package com.mytests.spring.springmongodbuuidkt

import org.springframework.data.mongodb.core.mapping.Document

@Document
class Person(var name: String?, var age: Int) : BaseEntityWithUuidId() {
    override fun toString(): String {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id.toString() +
                '}'
    }
}
