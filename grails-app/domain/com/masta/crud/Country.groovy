package com.masta.crud

class Country {
	String name

    static constraints = {
		name unique:true
    }
	
	String toString() {
		return this.name
	}
}
