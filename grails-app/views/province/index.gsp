
<%@ page import="com.masta.crud.Province" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'province.label', default: 'Province')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-province" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-province" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="name" title="${message(code: 'province.name.label', default: 'Name')}" />
					
						<th><g:message code="province.country.label" default="Country" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${provinceInstanceList}" status="i" var="provinceInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${provinceInstance.id}">${fieldValue(bean: provinceInstance, field: "name")}</g:link></td>
					
						<td>${fieldValue(bean: provinceInstance, field: "country")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${provinceInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
