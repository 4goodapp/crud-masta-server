package com.masta.crud

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
