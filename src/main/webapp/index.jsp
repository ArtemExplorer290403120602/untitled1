<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>request</title>
</head>
<body>
<h1>Save Request Information</h1>
<form action="save-request" method="post">
    <label for="firstName">firstName:</label>
    <input type="text" id="firstName" name="firstName" required>
    <br>
    <br>
    <label for="lastName">lastName:</label>
    <input type="text" id="lastName" name="lastName" required>
    <br>
    <br>
    <label for="telephone">telephone:</label>
    <input type="number" id="telephone" name="telephone" required>
    <br>
    <button type="submit">Save request</button>
</form>
</body>
</html>
