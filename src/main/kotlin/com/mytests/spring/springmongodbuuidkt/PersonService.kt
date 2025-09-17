package com.mytests.spring.springmongodbuuidkt

import org.springframework.stereotype.Service
import java.util.function.Consumer

@Service
class PersonService(private val personRepository: PersonRepository) {
    fun populatePerson() {
        personRepository.insert(Person("Joy", 10))
        personRepository.insert(Person("John", 20))
        personRepository.insert(Person("Jane", 30))
        personRepository.insert(Person("Jack", 40))
        personRepository.insert(Person("Julia", 50))
    }

    fun displayAll() {
        println("====== All =====")
        personRepository.findAll().forEach(Consumer { x: Person? -> println(x) })
        println("===================")
    }
}
