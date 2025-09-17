package com.mytests.spring.springmongodbuuidkt

import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Runner {
    @Bean
    fun commandLineRunner(personService: PersonService): CommandLineRunner {
        return CommandLineRunner { args: Array<String> ->
            println("--------------------------------------")
            personService.populatePerson()
            personService.displayAll()
            personService.displayByAgeLessThan(40)
            personService.displayByName("Jo")
            println("--------------------------------------")
        }
    }
}
