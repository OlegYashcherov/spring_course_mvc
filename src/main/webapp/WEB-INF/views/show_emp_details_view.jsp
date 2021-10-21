<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Show details</title>
</head>

    <body>
        <!--<h2>Hello, ${param.employeeName}!</h2>-->
        <%--<h2>Hello, ${nameAttribute}!</h2>--%>
        <h2>Name ${employee.name}</h2>
        <h2>Surname ${employee.surname}</h2>
        <h2>Salary ${employee.salary}</h2>
        <h2>Department ${employee.department}</h2>
        <h2>Car ${employee.carBrand}</h2>
        <br>
        <h2>Language(s)</h2>
        <ul>
            <c:forEach var="lang" items="${employee.languages}">
                <li>${lang}</li>
            </c:forEach>
        </ul>
        <h2>Phone number ${employee.phoneNumber}</h2>
        <h2>Email ${employee.email}</h2>
    </body>
</html>