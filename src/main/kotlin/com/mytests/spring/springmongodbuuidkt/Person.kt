package com.mytests.spring.springmongodbuuidkt

import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document(collection = "person")
class Person(@Field(name = "name") var firstName: String?,
             var age: Int) : BaseEntityWithUuidId() {

    @Field(name = "surname")
    var lastName: String? = null

    constructor(firstName: String?, lastName: String?, age: Int) : this(firstName, age) {
        this.lastName = lastName
    }
    override fun toString(): String {
        return "Person{" +
                "name='" + firstName + '\'' +
                ", surname='" + lastName + '\'' +
                ", age=" + age +
                ", id=" + id.toString() +
                '}'
    }
}
