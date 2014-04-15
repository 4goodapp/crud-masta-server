package com.masta.crud

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Person)
class PersonSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "complete save should success"() {
		when:'create person object with all related attributes'
		
		def country = new Country(name:"Indo")
		def p3 = new Province(name:"Jawa_Timur", country:country)
		def c1 = new City(name:"Surabaya",province:p3)
		
		def g1 = new Gender(name:"Male",code: "M")
		
		def r1 = new Religion(name:"Islam")
		
		def person = new Person()
		person.name="Arkenoid"
		person.password="mjtqs123"
		person.birthDay=new Date()
		person.birthCity=c1
		person.gender=g1
		person.religion=r1
		person.description="Saya orang yang sangat"
		
		then:"should pass"
		person.validate()
		!person.hasErrors()
    }
	
	void "partial save should fail"() {
		when:'create person object with few related attributes'
		
		def person = new Person()
		person.name="Arkenoid"
		person.password="mjtqs123"
		person.birthDay=new Date()
		person.description="Saya orang yang sangat"
		
		then:"should pass"
		!person.validate()
		person.hasErrors()
	}
}
