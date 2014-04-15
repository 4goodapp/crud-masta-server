package com.masta.crud

class Person {
	String name
	String password
	Date birthDay
	City birthCity
	Gender gender
	String description
	Religion religion
	
	static hasMany = [hobbies: Hobby, personEducation:PersonEducation]

    static constraints = {
		name unique:true, nullable:false
		password nullable:false
		birthDay nullable:false
		birthCity nullable:false
		description maxSize:1000, blank:false
    }
	String toString() {
		return this.name
	}
}
