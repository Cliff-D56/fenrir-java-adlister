<%--
  Created by IntelliJ IDEA.
  User: cliffordgardner
  Date: 11/3/23
  Time: 12:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza-Order</title>
</head>
<body>
<form method="post" action="/pizza-order">
  <label for="crust">Crust</label>
    <select name ="crust" id="crust">
    <option value="1Crust">Crust 1</option>
    <option value="2Crust">Crust 2</option>
    <option value="3Crust">Crust 3</option>
  </select>
  <label for="sauce">Sauce</label>
<select name="sauce" id="sauce">
    <option value="Sauce 1">Sauce 1</option>
    <option value="Sauce 2">Sauce 2</option>
    <option value="Sauce 3">Sauce 3</option>
  </select>
  <label for="size">Size</label>
    <select name="size" id="size">
    <option value="Big">Big</option>
    <option value="Medium">Medium</option>
    <option value="Small">Small</option>
  </select>
    <label for="pep">pep</label><input type="checkbox" id="pep" name="toppings" value="pep">
    <label for="sas">sas</label><input type="checkbox" id="sas" name="toppings" value="sas">
    <label for="pin">pin</label><input type="checkbox" id="pin" name="toppings" value="pin">
    <label for="address">Delivery Address</label><input type="text" name="address" id="address">
  <button type="submit">HI</button>
</form>
</body>
</html>
