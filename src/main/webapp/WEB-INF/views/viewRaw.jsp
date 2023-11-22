<%@page import="com.mvc.Inventory.Model.RawMaterial"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table  class="table">
  <tr>
    <th>ID</th>
    <th>Product Name</th>
    <th>Quantity</th>
    <th>Unit</th>
    <th>Cost</th>
    <th>Action</th>
    
  </tr>
  <% 
 	List<RawMaterial> rawMaterial =(List<RawMaterial>) request.getAttribute("rawMaterial");
  	for(RawMaterial r : rawMaterial)
  	{
  %>
  <tr>
    <td><%= r.getId() %></td>
    <td><%= r.getPname() %></td>
    <td><%= r.getQuantity()%></td>
    <td> <%= r.getUnit() %></td>
    <td> <%= r.getCost() %></td>
    <td> <a href="delete/<%= r.getId() %>">Delete</a> </td>
  </tr>
  <% } %>
  
  
</table>

</body>
</html>