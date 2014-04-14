<%@ page import="com.masta.crud.Province" %>



<div class="fieldcontain ${hasErrors(bean: provinceInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="province.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${provinceInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: provinceInstance, field: 'country', 'error')} required">
	<label for="country">
		<g:message code="province.country.label" default="Country" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="country" name="country.id" from="${com.masta.crud.Country.list()}" optionKey="id" required="" value="${provinceInstance?.country?.id}" class="many-to-one"/>
</div>

