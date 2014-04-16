
<%@ page import="com.masta.crud.PersonEducation" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'personEducation.label', default: 'PersonEducation')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-personEducation" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-personEducation" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list personEducation">
			
				<g:if test="${personEducationInstance?.educationType}">
				<li class="fieldcontain">
					<span id="educationType-label" class="property-label"><g:message code="personEducation.educationType.label" default="Education Type" /></span>
					
						<span class="property-value" aria-labelledby="educationType-label"><g:link controller="educationType" action="show" id="${personEducationInstance?.educationType?.id}">${personEducationInstance?.educationType?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${personEducationInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="personEducation.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${personEducationInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${personEducationInstance?.person}">
				<li class="fieldcontain">
					<span id="person-label" class="property-label"><g:message code="personEducation.person.label" default="Person" /></span>
					
						<span class="property-value" aria-labelledby="person-label"><g:link controller="personWeb" action="show" id="${personEducationInstance?.person?.id}">${personEducationInstance?.person?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:personEducationInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${personEducationInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
