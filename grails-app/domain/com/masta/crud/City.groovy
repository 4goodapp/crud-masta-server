package com.masta.crud

class City {
	String name
	Province province

    static constraints = {
		name unique:true
    }
	String toString() {
		return this.name
	}
}
