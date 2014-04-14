package com.masta.crud



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class ProvinceController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Province.list(params), model:[provinceInstanceCount: Province.count()]
    }

    def show(Province provinceInstance) {
        respond provinceInstance
    }

    def create() {
        respond new Province(params)
    }

    @Transactional
    def save(Province provinceInstance) {
        if (provinceInstance == null) {
            notFound()
            return
        }

        if (provinceInstance.hasErrors()) {
            respond provinceInstance.errors, view:'create'
            return
        }

        provinceInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'provinceInstance.label', default: 'Province'), provinceInstance.id])
                redirect provinceInstance
            }
            '*' { respond provinceInstance, [status: CREATED] }
        }
    }

    def edit(Province provinceInstance) {
        respond provinceInstance
    }

    @Transactional
    def update(Province provinceInstance) {
        if (provinceInstance == null) {
            notFound()
            return
        }

        if (provinceInstance.hasErrors()) {
            respond provinceInstance.errors, view:'edit'
            return
        }

        provinceInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Province.label', default: 'Province'), provinceInstance.id])
                redirect provinceInstance
            }
            '*'{ respond provinceInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Province provinceInstance) {

        if (provinceInstance == null) {
            notFound()
            return
        }

        provinceInstance.delete flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Province.label', default: 'Province'), provinceInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'provinceInstance.label', default: 'Province'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
