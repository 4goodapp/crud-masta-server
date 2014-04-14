<%@ page import="com.masta.crud.PersonEducation" %>



<div class="fieldcontain ${hasErrors(bean: personEducationInstance, field: 'educationType', 'error')} required">
	<label for="educationType">
		<g:message code="personEducation.educationType.label" default="Education Type" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="educationType" name="educationType.id" from="${com.masta.crud.EducationType.list()}" optionKey="id" required="" value="${personEducationInstance?.educationType?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: personEducationInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="personEducation.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${personEducationInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: personEducationInstance, field: 'person', 'error')} required">
	<label for="person">
		<g:message code="personEducation.person.label" default="Person" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="person" name="person.id" from="${com.masta.crud.Person.list()}" optionKey="id" required="" value="${personEducationInstance?.person?.id}" class="many-to-one"/>
</div>

