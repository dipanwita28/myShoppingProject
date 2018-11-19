 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

.foo li {
   float: left;
    width: 30.33%;
    padding: 5px;
}

</style>
<%@include file="searchproduct.jsp"%>
 <body>
   <div>
 <ol class="foo">
    <ul><c:forEach items="${msg}" var="user" >
 <tr><br>
 <li>
 <div class="row">
  <div class="column">
    <img src="shoe.jpg" alt="Shoe" style="width:50%">
  </div>
 <th>Pid:</th>
<td><c:out value="${user.pId}"/></td>
<br>
<th>Pname:</th>
<td><c:out value="${user.pName}"/></td><br>
<th>Pprice:</th>
<td><c:out value="${user.pPrice}"/></td><br>
<th>Pdesc:</th>
<td><c:out value="${user.pDescription}"/></td><br>
<th>Pcomp:</th>
<td><c:out value="${user.pCompany}"/></td><br>
 </c:forEach></li>
</ol>
</div>
</body>
</html>