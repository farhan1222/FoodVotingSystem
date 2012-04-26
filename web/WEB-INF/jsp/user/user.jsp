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
<head><title>User Page</title>
    <script type="text/javascript">
        function displayResult() {
            var x = document.getElementById("red").value;
            alert(x);
        }
    </script>

</head>
<body>Place your content here


<table>
    <tr>
        <th>Name</th>
        <th>Votes</th>
    </tr>

    What Breakfast do you prefer?<br/>

    <form action="VoteController.do" method="POST">
        <c:forEach var="food" items="${foodList}">

           <c:if test="${food.foodID==1}">Food One
            <input type="radio" name="food" id=""${food.foodName}" value="${food.foodId}"/>${food.foodName}<br/>


        </c:forEach>
        <button type="submit" >Display value</button>
    </form>



<%--    What Breakfast do you prefer?<br/>

    <form action="VoteController.do" method="POST">
        <c:forEach var="food" items="${foodList}">


            <input type="radio" name="food" id=""${food.foodName}" value="${food.foodId}"/>${food.foodName}<br/>


        </c:forEach>
        <button type="submit" >Display value</button>
    </form>--%>
</table>


</body>
</html>