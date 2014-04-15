package com.masta.crud

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Religion)
class ReligionSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "inserting null name should fail"() {
		when: 'the name is empty'
		def p = new Religion()

		then: 'validation should fail'
		!p.validate()
    }

}
