<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>User Registration Form</title>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>

<body>
 	<div class="generic-container">
		<%@include file="authheader.jsp" %>

		<div class="well lead">Update User Permissions</div>
		
		<form:form method="POST" modelAttribute="user" class="form-horizontal">
		
		<form:input type="hidden" path="id" id="id"/>
		
		<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="enabled">permissions:</label>
					<div class="col-md-7">
						<form:select path="enabled" id="enabled" class="form-control input-sm" >
							
							<c:choose>
							<c:when test="${user.enabled}">
						 <option selected="selected" value="true">ENABLED</option>
   						 <option value="false">DISABLED</option>
   						 	</c:when>
							<c:otherwise>
						 <option value="true">ENABLED</option>
   						 <option selected="selected" value="false">DISABLED</option>
   						 	</c:otherwise>
						</c:choose>
   						 
   						 </form:select>
						<div class="has-error">
							<form:errors path="enabled" class="help-inline"/>
							
						</div>
					</div>
					
					<input type="submit" value="Update" class="btn btn-primary btn-sm"/> or <a href="<c:url value='/list' />">Cancel</a>
				</div>
			</div>

			</form:form>		
			</div>
	</body>
</html>