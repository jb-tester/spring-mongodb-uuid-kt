package com.mytests.spring.springmongodbuuidkt

import org.springframework.stereotype.Service
import java.util.function.Consumer

@Service
class PersonService(private val personRepository: PersonRepository) {
    fun populatePerson() {
        personRepository.deleteAll()
        personRepository.insert(Person("Joy", "Smith", 10))
        personRepository.insert(Person("John", "Johnson", 20))
        personRepository.insert(Person("Jane", "Daniels", 30))
        personRepository.insert(Person("Jack", "Jackson", 40))
        personRepository.insert(Person("Julia", "Doe", 50))
    }

    fun displayAll() {
        println("====== All ===========================================")
        personRepository.findAll().forEach(Consumer { x: Person? -> println(x) })
        println("======================================================")
    }
    fun displayByAgeLessThan(age: Int) {
        println("====== persons < $age=================================")
        personRepository.findByAge(age).forEach(Consumer { x: Person? -> println(x) })
        println("======================================================")
    }
}
