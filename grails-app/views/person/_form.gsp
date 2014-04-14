<%@ page import="com.masta.crud.Person" %>



<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="person.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${personInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'password', 'error')} ">
	<label for="password">
		<g:message code="person.password.label" default="Password" />
		
	</label>
	<g:textField name="password" value="${personInstance?.password}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'birthDay', 'error')} required">
	<label for="birthDay">
		<g:message code="person.birthDay.label" default="Birth Day" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="birthDay" precision="day"  value="${personInstance?.birthDay}"  />
</div>

<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'birthCity', 'error')} required">
	<label for="birthCity">
		<g:message code="person.birthCity.label" default="Birth City" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="birthCity" name="birthCity.id" from="${com.masta.crud.City.list()}" optionKey="id" required="" value="${personInstance?.birthCity?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'description', 'error')} ">
	<label for="description">
		<g:message code="person.description.label" default="Description" />
		
	</label>
	<g:textField name="description" value="${personInstance?.description}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'gender', 'error')} required">
	<label for="gender">
		<g:message code="person.gender.label" default="Gender" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="gender" name="gender.id" from="${com.masta.crud.Gender.list()}" optionKey="id" required="" value="${personInstance?.gender?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'hobbies', 'error')} ">
	<label for="hobbies">
		<g:message code="person.hobbies.label" default="Hobbies" />
		
	</label>
	<g:select name="hobbies" from="${com.masta.crud.Hobby.list()}" multiple="multiple" optionKey="id" size="5" value="${personInstance?.hobbies*.id}" class="many-to-many"/>
</div>

<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'personEducation', 'error')} ">
	<label for="personEducation">
		<g:message code="person.personEducation.label" default="Person Education" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${personInstance?.personEducation?}" var="p">
    <li><g:link controller="personEducation" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="personEducation" action="create" params="['person.id': personInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'personEducation.label', default: 'PersonEducation')])}</g:link>
</li>
</ul>

</div>

