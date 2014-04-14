package com.masta.crud



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class PersonEducationController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond PersonEducation.list(params), model:[personEducationInstanceCount: PersonEducation.count()]
    }

    def show(PersonEducation personEducationInstance) {
        respond personEducationInstance
    }

    def create() {
        respond new PersonEducation(params)
    }

    @Transactional
    def save(PersonEducation personEducationInstance) {
        if (personEducationInstance == null) {
            notFound()
            return
        }

        if (personEducationInstance.hasErrors()) {
            respond personEducationInstance.errors, view:'create'
            return
        }

        personEducationInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'personEducationInstance.label', default: 'PersonEducation'), personEducationInstance.id])
                redirect personEducationInstance
            }
            '*' { respond personEducationInstance, [status: CREATED] }
        }
    }

    def edit(PersonEducation personEducationInstance) {
        respond personEducationInstance
    }

    @Transactional
    def update(PersonEducation personEducationInstance) {
        if (personEducationInstance == null) {
            notFound()
            return
        }

        if (personEducationInstance.hasErrors()) {
            respond personEducationInstance.errors, view:'edit'
            return
        }

        personEducationInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'PersonEducation.label', default: 'PersonEducation'), personEducationInstance.id])
                redirect personEducationInstance
            }
            '*'{ respond personEducationInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(PersonEducation personEducationInstance) {

        if (personEducationInstance == null) {
            notFound()
            return
        }

        personEducationInstance.delete flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'PersonEducation.label', default: 'PersonEducation'), personEducationInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'personEducationInstance.label', default: 'PersonEducation'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
