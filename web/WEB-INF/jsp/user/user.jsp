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


    <c:if test="${breakfastFlag ne 1}">
        What Breakfast do you prefer?<br/>

        <form action="VoteController.do" method="POST">
            <c:forEach var="food" items="${breakfastList}">

                <%--           <c:if test="${food.foodID==1}">Food One--%>
                <input type="radio" name="food" id=""${food.foodName}" value="${food.foodId}"/>${food.foodName}<br/>


            </c:forEach>
            <button type="submit">OK</button>
        </form>
    </c:if>


    <br>
    <br>

    <c:if test="${lunchFlag ne 1}">
        What Lunch do you prefer?<br/>

        <form action="VoteController.do" method="POST">
            <c:forEach var="food" items="${lunchList}">

                <%--           <c:if test="${food.foodID==1}">Food One--%>
                <input type="radio" name="food" id=""${food.foodName}" value="${food.foodId}"/>${food.foodName}<br/>


            </c:forEach>
            <button type="submit">OK</button>
        </form>
    </c:if>
    <br>
    <br>

    <c:if test="${dinnerFlag ne 1}">
        What Dinner do you prefer?<br/>

        <form action="VoteController.do" method="POST">
            <c:forEach var="food" items="${dinnerList}">

                <%--           <c:if test="${food.foodID==1}">Food One--%>
                <input type="radio" name="food" id=""${food.foodName}" value="${food.foodId}"/>${food.foodName}<br/>


            </c:forEach>
            <button type="submit">OK</button>
        </form>
    </c:if>

</table>


<c:forEach var="foodType" items="${FOODTYPELIST}">

    <div>
        <c:set var="isVoted" value="false"></c:set>
        <li style="list-style-type:none">${foodType.foodTypeName}</li>
        <c:if test="${foodType.votedFood ne null}">
            </br><li style="color:red; list-style-type:none">You have already voted for this type of foods</li>
            <c:set var="isVoted" value="true"></c:set>
        </c:if>
        <br/>

        <div style="margin-left:50px">
            <c:if test="${isVoted eq 'true'}">
                <c:forEach var="food" items="${foodType.foodList}">
                    <li>${food.foodName}</li>
                    <br/>
                </c:forEach>
            </c:if>
            <c:if test="${isVoted eq 'false'}">
                <form action="/foodvoting/vote" method="post">

                    <c:forEach var="food" items="${foodType.foodList}">
                        <input type="radio" id="${food.foodName}" name="${foodType.foodTypeName}"
                               value="${food.foodName}">
                        <label for="${food.foodName}">${food.foodName}</label></br></br>
                    </c:forEach>
                    </br><input type="submit" value="Vote">
                </form>
            </c:if>
        </div>
    </div>
</c:forEach>


</body>
</html>