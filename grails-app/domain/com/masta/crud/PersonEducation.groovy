package com.masta.crud


import grails.rest.Resource

@Resource(uri="/rest/personEdu", formats=['json', 'xml'])
class PersonEducation {
	String name
	EducationType educationType

    static constraints = {
    }
	static belongsTo= [person:Person]
	String toString() {
		return this.name
	}
}
