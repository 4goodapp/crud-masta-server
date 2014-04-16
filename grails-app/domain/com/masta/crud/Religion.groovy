package com.masta.crud

import grails.rest.Resource;

@Resource(uri="/rest/religion", formats=['json', 'xml'])
class Religion {
	String name

    static constraints = {
		name unique:true,nullable:false
    }
	String toString() {
		return this.name
	}
}
