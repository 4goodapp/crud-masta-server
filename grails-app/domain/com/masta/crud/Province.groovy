package com.masta.crud

class Province {
	String name
	Country country

    static constraints = {
		name unique:true
    }
	String toString() {
		return this.name
	}
}
