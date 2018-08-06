<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>p122 where절 서브쿼리 실행 결과</h1>
	<table border=1>
	    <thead>
	        <tr>
	            <th>케익이름</th>
	            <th>가격</th>
	        </tr>
	    </thead>
	    <tbody>
	        <c:forEach var="cake" items="${list}">
	            <tr>
	                <td>${cake.name}
	                <td>${cake.price}
	            </tr>
	        </c:forEach>
	    </tbody>
	</table>
</body>
</html>