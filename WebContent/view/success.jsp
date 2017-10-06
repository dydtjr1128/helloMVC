<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 태그 라이브러리 디스크립터 core 에 있는 라이브러리들은  prefix 를 c라고 붙이겠다.  -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	success!!
	<%-- JSP Expression Language --%>
	<ul>
		<li>Id: ${customer.id}</li>
		<li>Name: ${customer.name}</li>
		<li>Email: ${customer.email}</li>
	</ul>

	<!-- JSTL -->
	<table border=1>
		<!-- request의 customerList를 customer라고 하고 끝까지 출력시킨다. -->
		<c:forEach var="customer" items="${customerList}">
			<tr>
				<td>${customer.id}</td>
				<td>${customer.name}</td>
				<td>${customer.email}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>