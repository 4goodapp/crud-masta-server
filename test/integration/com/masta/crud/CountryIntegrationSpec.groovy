package com.masta.crud



import spock.lang.*

/**
 *
 */
class CountryIntegrationSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "Saving Country to DB"() {
		given:"new country"
		def country = new Country(name: "Amerika")
		
		when:"country is saved"
		country.save()
		
		then:"save success and can found on DB"
		country.errors.errorCount==0
		country.id!=null
		Country.get(country.id).name=="Amerika"
    }
	
	void "saving same country should fail"() {
		given:"new country"
		def country = new Country(name: "Indonesia")
		
		when:"country is saved"
		country.save()
		
		then:"save success and can found on DB"
		country.errors.errorCount==1
		country.errors['name'].toString().contains('must be unique')
	}
}
