package com.masta.crud

import grails.rest.Resource

@Resource(uri="/rest/eduType", formats=['json', 'xml'])
class EducationType {
	String name

    static constraints = {
    }
	String toString() {
		return this.name
	}
}
