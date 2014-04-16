package com.masta.crud

import grails.rest.Resource

@Resource(uri="/rest/gender", formats=['json', 'xml'])
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
