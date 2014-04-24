package com.masta.crud

import grails.transaction.Transactional

@Transactional
class PeopleService {
	
	@Transactional(readOnly=true)
    def countPeople() {
		return Person.count()
    }
	
	@Transactional(readOnly=true)
	def sayHello() {
		return "Hello World"
	}
	
	def savePerson(Person person) {
		person.save(failOnError:true)
	}	
}
