
<%@ page import="com.masta.crud.Person" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'person.label', default: 'Person')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-person" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-person" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list person">
			
				<g:if test="${personInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="person.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${personInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${personInstance?.password}">
				<li class="fieldcontain">
					<span id="password-label" class="property-label"><g:message code="person.password.label" default="Password" /></span>
					
						<span class="property-value" aria-labelledby="password-label"><g:fieldValue bean="${personInstance}" field="password"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${personInstance?.birthDay}">
				<li class="fieldcontain">
					<span id="birthDay-label" class="property-label"><g:message code="person.birthDay.label" default="Birth Day" /></span>
					
						<span class="property-value" aria-labelledby="birthDay-label"><g:formatDate date="${personInstance?.birthDay}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${personInstance?.birthCity}">
				<li class="fieldcontain">
					<span id="birthCity-label" class="property-label"><g:message code="person.birthCity.label" default="Birth City" /></span>
					
						<span class="property-value" aria-labelledby="birthCity-label"><g:link controller="city" action="show" id="${personInstance?.birthCity?.id}">${personInstance?.birthCity?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${personInstance?.description}">
				<li class="fieldcontain">
					<span id="description-label" class="property-label"><g:message code="person.description.label" default="Description" /></span>
					
						<span class="property-value" aria-labelledby="description-label"><g:fieldValue bean="${personInstance}" field="description"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${personInstance?.gender}">
				<li class="fieldcontain">
					<span id="gender-label" class="property-label"><g:message code="person.gender.label" default="Gender" /></span>
					
						<span class="property-value" aria-labelledby="gender-label"><g:link controller="gender" action="show" id="${personInstance?.gender?.id}">${personInstance?.gender?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${personInstance?.hobbies}">
				<li class="fieldcontain">
					<span id="hobbies-label" class="property-label"><g:message code="person.hobbies.label" default="Hobbies" /></span>
					
						<g:each in="${personInstance.hobbies}" var="h">
						<span class="property-value" aria-labelledby="hobbies-label"><g:link controller="hobby" action="show" id="${h.id}">${h?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${personInstance?.personEducation}">
				<li class="fieldcontain">
					<span id="personEducation-label" class="property-label"><g:message code="person.personEducation.label" default="Person Education" /></span>
					
						<g:each in="${personInstance.personEducation}" var="p">
						<span class="property-value" aria-labelledby="personEducation-label"><g:link controller="personEducation" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${personInstance?.religion}">
				<li class="fieldcontain">
					<span id="religion-label" class="property-label"><g:message code="person.religion.label" default="Religion" /></span>
					
						<span class="property-value" aria-labelledby="religion-label"><g:link controller="religion" action="show" id="${personInstance?.religion?.id}">${personInstance?.religion?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:personInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${personInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
