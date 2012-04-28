<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

<%--    <title>Food Voting</title>--%>
</head>
<body>

<%--<div id="wrapper">--%>
	<%--<div id="header-wrapper">--%>
		<%--<div id="header">--%>
			<%--<div id="logo">--%>
				<%--<h1><a href="#">Food Voting System</a></h1>--%>

			<%--</div>--%>
		<%--</div>--%>
<%--</div>--%>
	<!-- end #header -->

	<!-- end #menu -->
	<div id="page">
        <br> <br> <br> <br>
		<div id="content">

            <form action="loginController.do" method="POST">
                <table>
                    <tr>
                        <td>
                        User Name:
                        </td>
                        <td> <input type="text" name="username"> </td>


                    </tr>

                    <tr>
                        <td>
                        Password:
                        </td>
                        <td> <input type="password" name="password">  </td>
                    </tr>
                     <tr>
                        <td>
                        <input type="submit" value="Log In">
                         </td>
                    </tr>
                </table>
            </form>



			<div style="clear: both;">&nbsp;</div>
		</div>
		<!-- end #content -->

		<!-- end #sidebar -->
		<div style="clear: both;">&nbsp;</div>
	</div>
	<!-- end #page -->
</div>

</body>
</html>
