package com.masta.crud

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(PeopleService)
@Mock([Person])
class PeopleServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "return count of person"() {
		given:"siapin 2 data person beserta referensi nya"
		def country = new Country(name:"Indo")
		def p3 = new Province(name:"Jawa_Timur", country:country)
		def c1 = new City(name:"Surabaya",province:p3)
		
		def g1 = new Gender(name:"Male",code: "M")
		
		def r1 = new Religion(name:"Islam")
		
		def person1 = new Person()
		person1.name="Arkenoid1"
		person1.password="mjtqs123"
		person1.birthDay=new Date()
		person1.birthCity=c1
		person1.gender=g1
		person1.religion=r1
		person1.description="Saya orang yang sangat"
		
		def person2 = new Person()
		person2.name="Arkenoid2"
		person2.password="mjtqs123"
		person2.birthDay=new Date()
		person2.birthCity=c1
		person2.gender=g1
		person2.religion=r1
		person2.description="Saya orang yang sangat"
		
		when:"masukin dulu. baru ayo hitung berapa banyak person"
		service.savePerson(person1)
		service.savePerson(person2)
		def result=service.countPeople()
		
		then:"harus balikin 2 ya"
		result==2
    }
}
