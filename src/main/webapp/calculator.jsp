<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 9/14/2023
  Time: 8:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tính toán</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<form action="calculator" method="get">
    <div class="mb-3">
        <label for="firstNumber" class="form-label">Số thứ nhất</label>
        <input value="${firstNumber}" type="text" class="form-control" id="firstNumber" name="firstNumber">
        <p class="text-danger">${errorFirstNumber}</p>
    </div>
    <div class="mb-3">
        <label for="secondNumber" class="form-label">Số thứ 2</label>
        <input value="${secondNumber}" type="text" class="form-control" id="secondNumber" name="secondNumber">
    </div>
    <button type="submit" class="btn btn-primary">Tính tổng</button>
</form>

<h1>Tổng là: ${total}</h1>
</body>
</html>
