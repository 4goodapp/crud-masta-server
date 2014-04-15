package com.masta.crud

class Religion {
	String name

    static constraints = {
		name unique:true,nullable:false
    }
	String toString() {
		return this.name
	}
}
