<%@ page import="com.masta.crud.City" %>



<div class="fieldcontain ${hasErrors(bean: cityInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="city.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${cityInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: cityInstance, field: 'province', 'error')} required">
	<label for="province">
		<g:message code="city.province.label" default="Province" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="province" name="province.id" from="${com.masta.crud.Province.list()}" optionKey="id" required="" value="${cityInstance?.province?.id}" class="many-to-one"/>
</div>

