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
<head><title>Admin page</title>

    <div style="padding-left:800px;">
        Hi, ${userName} &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

        <a href="LogOut.do">Log Out</a>
    </div>
</head>

<body>

<div id="page">
    <br> <br><br><br>

    <div id="content">

        <strong> Admin Page </strong> <br> <br>
        <strong>Food List</strong> <br> <br>


        <table>

            <%--                <tr>
                <br>
                BREAKFAST
                <br>
                <br>
                <table>
                    <c:forEach var="food" items="${foodList}">
                        <c:if test="${food.foodType eq 'Breakfast'}">
                            <tr>

                                <td>
                                        ${food.foodName}
                                </td>
                                <td>
                                        ${food.count}
                                </td>
                                <br>

                            </tr>
                        </c:if>

                    </c:forEach>

                </table>

            </tr>--%>
            <tr>
                <br>
                BREAKFAST
                <br>
                <br>
                <table>

                    <c:forEach var="food" items="${foodList}">

                        <tr>
                            <c:if test="${food.foodType eq 'Breakfast'}">

                                <td>
                                        ${food.foodName}
                                </td>
                                <td>
                                        ${food.count}
                                </td>

                            </c:if>
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

                    <c:forEach var="food" items="${foodList}">

                        <tr>
                            <c:if test="${food.foodType eq 'Lunch'}">

                                <td>
                                        ${food.foodName}
                                </td>
                                <td>
                                        ${food.count}
                                </td>

                            </c:if>
                        </tr>
                    </c:forEach>
                </table>
            </tr>

            <tr>
                <br>
                DINNER
                <br>
                <br>
            <table>

                <c:forEach var="food" items="${foodList}">

                    <tr>
                        <c:if test="${food.foodType eq 'Dinner'}">

                            <td>
                                    ${food.foodName}
                            </td>
                            <td>
                                    ${food.count}
                            </td>
                        </c:if>

                    </tr>
                </c:forEach>
            </table>


        </table>


        <div style="clear: both;">&nbsp;</div>
    </div>
    <!-- end #content -->

    <!-- end #sidebar -->
    <div style="clear: both;">&nbsp;</div>
</div>


</body>
</html>