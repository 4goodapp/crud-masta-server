
<%@ page import="com.masta.crud.PersonEducation" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'personEducation.label', default: 'PersonEducation')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-personEducation" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-personEducation" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<th><g:message code="personEducation.educationType.label" default="Education Type" /></th>
					
						<g:sortableColumn property="name" title="${message(code: 'personEducation.name.label', default: 'Name')}" />
					
						<th><g:message code="personEducation.person.label" default="Person" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${personEducationInstanceList}" status="i" var="personEducationInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${personEducationInstance.id}">${fieldValue(bean: personEducationInstance, field: "educationType")}</g:link></td>
					
						<td>${fieldValue(bean: personEducationInstance, field: "name")}</td>
					
						<td>${fieldValue(bean: personEducationInstance, field: "person")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${personEducationInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
