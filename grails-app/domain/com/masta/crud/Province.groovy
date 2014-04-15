package com.masta.crud

class Province {
	String name
	Country country

    static constraints = {
		name unique:true, size:5..15
    }
	String toString() {
		return this.name
	}
}
