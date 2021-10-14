<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
        <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
        
    
<!DOCTYPE html>
<html>
<head>

<title>Display</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
<h2>Ticket Details</h1>
<table class="table">
<thead>
<tr>
<th>Ticket id</th>
<th>Customer Id</th>

<th>Date of Booking</th>
<th>BookingAmount</th>
</tr>
</thead>
<tbody>
<tr class="info">
<td>${booking_info.booking_id}</td>
<td>${booking_info.cid}</td>
<td><fmt:formatDate value="${booking_info.booking_dt}" pattern="dd-MM-yyyy" /></td>
<td>${booking_info.price}</td>

</tr>
</tbody>


</table>
<br>
  <form action="cancelprocess" method="post">
    <div class="form-group">
    <input type=text value=${booking_info.booking_id} name="booking_id">
    <br>
      <label for="sel1">Please Select the reason for cancellation</label>
      <select class="form-control" name="reason">
        <option value="Duplicate Booking">Duplicate Booking</option>
        <option value="Change of plans">Change of plans</option>
        <option value="Different location preferred">Different location preferred</option>
        <option value="Different airline preferred">Different airline preferred</option>
      </select>
      <p>Refund of (${refund}) after cutting cancellation charge (${charge}) will be reflected on your bank account in 2 to 3 business days</p>
       <button type="submit" class="btn btn-primary">Submit</button>
      </div>
      </form>
</div>
</body>
</html>