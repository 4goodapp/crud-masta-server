
<%@ page import="com.masta.crud.Person" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'person.label', default: 'Person')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-person" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-person" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="name" title="${message(code: 'person.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="password" title="${message(code: 'person.password.label', default: 'Password')}" />
					
						<g:sortableColumn property="birthDay" title="${message(code: 'person.birthDay.label', default: 'Birth Day')}" />
					
						<th><g:message code="person.birthCity.label" default="Birth City" /></th>
					
						<g:sortableColumn property="description" title="${message(code: 'person.description.label', default: 'Description')}" />
					
						<th><g:message code="person.gender.label" default="Gender" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${personInstanceList}" status="i" var="personInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${personInstance.id}">${fieldValue(bean: personInstance, field: "name")}</g:link></td>
					
						<td>${fieldValue(bean: personInstance, field: "password")}</td>
					
						<td><g:formatDate date="${personInstance.birthDay}" /></td>
					
						<td>${fieldValue(bean: personInstance, field: "birthCity")}</td>
					
						<td>${fieldValue(bean: personInstance, field: "description")}</td>
					
						<td>${fieldValue(bean: personInstance, field: "gender")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${personInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
