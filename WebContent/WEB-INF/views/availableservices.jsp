<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>
    <div align="center">
        <form:form action="services" method="post" commandName="serviceForm">
            <table border="0">
                <tr>
                    <td colspan="3" align="center"><h2>Seals Shop Services</h2></td>
                </tr>
                <tr>
                    <td>Test 206</td>
                     <td><form:input path="test206"/></td>
                   	<td><input type="submit" value="Test Service 206 Status" /></td>
                </tr>
                <tr>
                    <td>Test 207</td>
                     <td><form:input path="test207"/></td>
                    <td><input type="submit" value="Test Service 207 Status" /></td>
                </tr>
                <tr>
                    <td>Stage 208</td>
                    <td><form:input path="stage208"/></td>
                   	<td><input type="submit" value="Stage Service 208 Status" /></td>
                </tr>
                <tr>
                    <td>Stage 209</td>
                    <td><form:input path="test209"/></td>
                   	<td><input type="submit" value="Stage Service 209 Status" /></td>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>