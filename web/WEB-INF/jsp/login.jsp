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
                User Name: <input type="text" name="username">    <br> <br>
                Password: <input type="password" name="password"> <br> <br>
                <input type="submit" value="Log In">
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
