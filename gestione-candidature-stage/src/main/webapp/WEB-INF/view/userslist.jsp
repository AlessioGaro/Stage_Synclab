<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Users List</title>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>

<body>
	<div class="generic-container">
		<%@include file="authheader.jsp" %>	
		<div class="panel panel-default">
			  <!-- Default panel contents -->
		  	<div class="panel-heading"><span class="lead">List of Users </span></div>
			<table class="table table-hover">
	    		<thead>
		      		<tr>
				        <th>Fiscal code</th>
				        <th>username</th>
				        <th>first name</th>
				       
				        <sec:authorize access="hasRole('ADMIN') or hasRole('MANAGER')">
				        	<th width="100"></th>
				        </sec:authorize>
				        <sec:authorize access="hasRole('ADMIN')">
				        	<th width="100"></th>
				        </sec:authorize>
				        
					</tr>
		    	</thead>
	    		<tbody>
				<c:forEach items="${users}" var="user"> 
					
					<tr>
					
						<c:choose>
						<c:when test="${!user.enabled}">
						
						<td><font color="red">${user.figure.fiscalCode}</font></td>
						<td><font color="red">${user.username}</font></td>
						<td><font color="red">${user.figure.firstName}</font></td>
						
						</c:when>
							<c:otherwise>
							
						<td>${user.figure.fiscalCode}</td>
						<td>${user.username}</td>
						<td>${user.figure.firstName}</td>
							
							</c:otherwise>
						</c:choose>
						
						
					 <sec:authorize access="hasRole('ADMIN') or hasRole('MANAGER')">
							<td><a href="<c:url value='/edit-user-${user.username}' />" class="btn btn-success custom-width">edit</a></td>
				        </sec:authorize>
				        <sec:authorize access="hasRole('ADMIN')">
							<td><a href="<c:url value='/modify-permission-${user.username}' />" class="btn btn-danger custom-width">enabled?</a></td>
        				</sec:authorize>
					</tr>
					
					</c:forEach>
	    		</tbody>
	    	</table>
		</div>
		<sec:authorize access="hasRole('ADMIN')">
		 	<div class="well">
		 		<a href="<c:url value='/newuser' />">Add New User</a>
		 	</div>
	 	</sec:authorize>
   	</div>
</body>
</html>