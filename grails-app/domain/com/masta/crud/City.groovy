package com.masta.crud

import grails.rest.Resource

@Resource(uri="/rest/city", formats=['json', 'xml'])
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
