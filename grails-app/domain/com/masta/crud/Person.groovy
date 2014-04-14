package com.masta.crud

class Person {
	String name
	String password
	Date birthDay
	City birthCity
	Gender gender
	String description
	
	static hasMany = [hobbies: Hobby, personEducation:PersonEducation]

    static constraints = {
		name unique:true, nullable:false
		password nullable:false
		birthDay nullable:false
		birthCity nullable:false
    }
	String toString() {
		return this.name
	}
}
