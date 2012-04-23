<%@ page import="net.therap.domain.Food" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%--
  Created by IntelliJ IDEA.
  User: farhan
  Date: 4/23/12
  Time: 5:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
        <tr>
            <td>
                 ${food.foodName}
            </td>
            <td>
               ${food.voteCount}
            </td>

        </tr>
    </c:forEach>



</table>

    <%--<table>

        <c:forEach var="food" items="${foodList}">
            migod
            <tr>
                <td>${food.foodName}</td>
            </tr>
        </c:forEach>
    </table>--%>


    <%

List<Food> food = (List<Food>)request.getAttribute("foodList");
Iterator<Food> it = food.iterator();
while(it.hasNext()) {
out.print("<br> food:  " + it.next().getFoodName());
}
    %>

</body>
</html>