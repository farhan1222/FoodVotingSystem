<%--<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>--%>
<%--
  Created by IntelliJ IDEA.
  User: farhan
  Date: 4/23/12
  Time: 5:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>Admin page</title></head>
<body>admin page <br> <br>
<strong>Food List<strong>

    <table>

    <tr>
    BREAKFAST
    <br>
    <br>
    <table>

        <c:forEach var="food" items="${breakfastList}">

            <tr>
                <td>
                        ${food.foodName}
                </td>
                <td>
                        ${food.count}
                </td>


            </tr>
        </c:forEach>
    </table>
    </tr>

    <tr>
    <br>
    LUNCH
    <br>
    <br>
    <table>

        <c:forEach var="food" items="${lunchList}">

            <tr>
                <td>
                        ${food.foodName}
                </td>
                <td>
                        ${food.count}
                </td>


            </tr>
        </c:forEach>
    </table>
    </tr>

    <tr>
    <br>
    LUNCH
    <br>
    <br>
    <table>

        <c:forEach var="food" items="${dinnerList}">

            <tr>
                <td>
                        ${food.foodName}
                </td>
                <td>
                        ${food.count}
                </td>


            </tr>
        </c:forEach>
    </table>


    </table>

</body>
</html>