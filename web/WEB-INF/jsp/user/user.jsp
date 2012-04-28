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
<head>
    <link href="/WEB-INF/css/style.css" rel="stylesheet" type="text/css" media="screen" />
    <title>User Page</title>
    <div style="padding-left:800px;">
        Hi, ${userName}           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

        <a  href ="LogOut.do">Log Out</a>
    </div>

    <%--<a style="padding-left:800px; padding-top:300px;" href ="LogOut.do">Log Out</a>--%>

</head>
<body>

<div id="wrapper">



	<div id="page">
        <br> <br> <br> <br>
		<div id="content">


            <table>

                <c:if test="${breakfastFlag ne 1}">
                    What Breakfast do you prefer?<br/>

                    <form action="VoteController.do" method="POST">
                        <fieldset>
                              <legend>Select:</legend>
                        <c:forEach var="food" items="${breakfastList}">

                            <%--           <c:if test="${food.foodID==1}">Food One--%>
                            <input type="radio" name="food" id=""${food.foodName}" value="${food.foodId}"/>${food.foodName}<br/>


                        </c:forEach>
                        <button type="submit">OK</button>

                       </fieldset>
                    </form>
                </c:if>

                <c:if test="${breakfastFlag ne 0}">
                    You have already given your Breakfast vote.
                </c:if>

                <br>
                <br>

                <c:if test="${lunchFlag ne 1}">
                    What Lunch do you prefer?<br/>

                    <form action="VoteController.do" method="POST">

                         <fieldset>
                              <legend>Select:</legend>
                        <c:forEach var="food" items="${lunchList}">

                            <%--           <c:if test="${food.foodID==1}">Food One--%>
                            <input type="radio" name="food" id=""${food.foodName}" value="${food.foodId}"/>${food.foodName}<br/>


                        </c:forEach>
                        <button type="submit">OK</button>

                             </fieldset>
                    </form>
                </c:if>

                 <c:if test="${lunchFlag ne 0}">
                    You have already given your Lunch vote.
                </c:if>
                <br>
                <br>

                <c:if test="${dinnerFlag ne 1}">
                    What Dinner do you prefer?<br/>

                    <form action="VoteController.do" method="POST">
                         <fieldset>
                              <legend>Select:</legend>
                        <c:forEach var="food" items="${dinnerList}">

                            <%--           <c:if test="${food.foodID==1}">Food One--%>
                            <input type="radio" name="food" id=""${food.foodName}" value="${food.foodId}"/>${food.foodName}<br/>


                        </c:forEach>
                        <button type="submit">OK</button>
                             </fieldset>
                    </form>
                </c:if>

                <c:if test="${dinnerFlag ne 0}">
                    You have already given your Dinner vote.
                </c:if>

            </table>




           <br><br> <br>




		</div>

		<div style="clear: both;">&nbsp;</div>
	</div>

</div>

 <%--<form target="logout" method="POST"></form>--%>
 <br>
 <br>




</body>
</html>