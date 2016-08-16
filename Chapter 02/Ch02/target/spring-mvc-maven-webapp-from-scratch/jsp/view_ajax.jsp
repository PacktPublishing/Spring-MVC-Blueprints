<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <table>
       <tr>
          <td><c:out value="${ multipart.originalFilename }"/></td>
          <td><a href='<c:url value="/edms/download_single_file.html?fileName=${  multipart.originalFilename }"/>'><c:out value="${  multipart.originalFilename }"/></a></td>
       </tr>
   </table>
   
</body>
</html>