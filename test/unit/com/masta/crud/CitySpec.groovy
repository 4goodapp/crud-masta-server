package com.masta.crud

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(City)
class CitySpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }
	
	void "Inserting 10 char"() {
		when:'10 char city name'
		def country = new Country(name:"Indo")
		def p3 = new Province(name:"Jawa_Timur", country:country)
		def c1 = new City(name:"Surabaya",province:p3)
		
		then:'validation harus success'
		c1.validate()
		
	}
	void "Inserting 10 char without province"() {
		when:'10 char province name'
		def c1 = new City(name:"Surabaya")
		
		then:'validation harus success'
		!c1.validate()
		c1.hasErrors()
		c1.errors['province']!=null
		
	}
}
