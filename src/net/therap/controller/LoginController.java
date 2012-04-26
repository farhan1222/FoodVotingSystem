package net.therap.controller;


import net.therap.domain.User;
import net.therap.service.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;


public class LoginController extends HttpServlet {
    private static final Logger log = LoggerFactory.getLogger(LoginController.class);

    // amader edit

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //response.setContentType("text/html");
        PrintWriter pw = response.getWriter();


        //pw.print(request.getParameter("username"));
        //pw.print(request.getParameter("password"));

        UserServiceImpl userService = new UserServiceImpl();

        User user = null;
        try {
            String userName;
            String password;


            if (!(userName = request.getParameter("username")).trim().equals("") && !(password = request.getParameter("password")).trim().equals("")) {

                user = userService.getUserByUserNameAndPassword(userName, password);
            } else {

                RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");

                view.forward(request, response);
                return;


            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (SQLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        if (user != null) {


            HttpSession session = request.getSession();
            session.setAttribute("userId", user.getId());
            session.setAttribute("userName", user.getUserName());
            session.setAttribute("userType", user.isAdmin());


            response.sendRedirect("FoodController.do");
        } else {
            RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");

            view.forward(request, response);
        }

    }

}
