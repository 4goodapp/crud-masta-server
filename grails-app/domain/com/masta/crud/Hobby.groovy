package com.masta.crud

import grails.rest.Resource

@Resource(uri="/rest/hobby", formats=['json', 'xml'])
class Hobby {
	String name

    static constraints = {
		name unique:true,nullable:false
    }
	String toString() {
		return this.name
	}
}
