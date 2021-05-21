<%@ page import="entity.Employee" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 5/21/2021
  Time: 7:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    ArrayList<Employee> listEmpl = (ArrayList<Employee>) request.getAttribute("listEmpl");
%>
<html>
<head>
    <title>List Student</title>
</head>
<body>
<h1>List Student</h1>
<ul>
    <% if(listEmpl != null && listEmpl.size() > 0){
        for(int i = 0; i < listEmpl.size(); i++){
    %>
    <li>
        <%= listEmpl.get(i).getFullName()%>
    </li>
    <%
            }
        }
    %>
</ul>
</body>
</html>
