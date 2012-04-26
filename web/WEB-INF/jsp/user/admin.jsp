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
<head><title>Simple admin page</title></head>
<body>admin page <br> <br>
<strong>Food List<strong>
    <table>
        <tr>
            <th>Name</th>
            <th>Votes</th>
        </tr>
        <c:forEach var="food" items="${foodList}">
            pritom
            <tr>
                <td>
                        ${food.foodName}
                </td>
                <td>
                        ${food.count}
                </td>

                <td>
                        ${food.foodType}
                </td>
                <td>
                        ${food.voted}
                </td>


            </tr>
        </c:forEach>
    </table>


    <%--    <%

List<Food> food = (List<Food>)request.getAttribute("foodList");
Iterator<Food> it = food.iterator();
while(it.hasNext()) {
out.print("<br> food:  " + it.next().getFoodName());
}
    %>--%>

</body>
</html>