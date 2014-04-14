package com.masta.crud

class Gender {
	String code
	String name

    static constraints = {
		code unique:true,nullable:false,maxLength:1
		name unique:true,nullable:false
    }
	String toString() {
		return this.name
	}
}
