<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	${insert}
	<form action="insert">
		<table>
			<tr>
				<td>ReservationId:</td>
				<td><input type="text" name="reservationId"></td>
			</tr>
			<tr>
				<td>PnrNumber:</td>
				<td><input type="text" name="pnrNumber"></td>
			</tr>
			<tr>
				<td>EventType:</td>
				<td><input type="text" name="eventType"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Insert"></td>
			</tr>
			
		</table>
	</form>

</body>
</html>