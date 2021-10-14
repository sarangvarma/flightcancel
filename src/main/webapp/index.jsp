<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title> Ticket Cancellation</title>
</head>
<body>
<div class="container">
  <h2>Ticket Cancellation</h2>
  <p>Enter the booking id of your tickt to cancel your ticket</p>
  <form action="process" method="post">
    <div class="form-group">
      <label for="booking_id">Booking Id :</label>
      <input type="text" class="form-control" name="booking_id" id="booking_id">
    </div>
      <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>

</body>
</html>