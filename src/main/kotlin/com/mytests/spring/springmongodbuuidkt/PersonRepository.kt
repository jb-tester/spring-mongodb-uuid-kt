package com.mytests.spring.springmongodbuuidkt

import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

interface PersonRepository : MongoRepository<Person, UUID>
