package com.masta.crud

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Province)
class ProvinceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }
	
	void "Inserting 10 char"() {
		when:'10 char province name'
		def country = new Country(name:"Indo")
		def p3 = new Province(name:"Jawa_Timur", country:country)
		
		then:'validation harus success'
		p3.validate()
		
	}
	void "Inserting 10 char without country"() {
		when:'10 char province name'
		def p3 = new Province(name:"Jawa_Timur")
		
		then:'validation harus error'
		!p3.validate()
		p3.hasErrors()
		p3.errors['country']!=null
		
	}
    void "Inserting less than 5 char"() {
		when:'4 char province name'
		def p1 = new Province(name:"Kuda")
		
		then:'validation harus gagal'
		!p1.validate()
		
    }
	
	void "Inserting greater than 15 char"() {
		when:'11 char province name'
		def p2 = new Province(name:"Kuda Binal Sejahtera")
		
		then:'validation harus gagal'
		!p2.validate()
		
	}
	
}
