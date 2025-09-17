package com.mytests.spring.springmongodbuuidkt

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import java.util.*

interface PersonRepository : MongoRepository<Person, UUID>{
    @Query($$"{age: {$lt : ?0}}")
    fun findByAge(age: Int): MutableList<Person>

    @Query("{name: {\$regex: ?0}}")
    fun findByName(name: String): MutableList<Person>
}
