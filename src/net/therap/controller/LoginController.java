package net.therap.controller;


import net.therap.domain.User;
import net.therap.service.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class LoginController extends HttpServlet {
    private static final Logger log = LoggerFactory.getLogger(LoginController.class);

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //response.setContentType("text/html");


        UserServiceImpl userService = new UserServiceImpl();

        User user = null;
        String userName;
        String password;


        if (!(userName = request.getParameter("username")).trim().equals("") && !(password = request.getParameter("password")).trim().equals("")) {

            user = userService.getUserByUserNameAndPassword(userName, password);
        }

        if (user == null) {

            RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");

            view.forward(request, response);

        } else {


            HttpSession session = request.getSession();
            session.setAttribute("userId", user.getId());
            session.setAttribute("userName", user.getUserName());
            session.setAttribute("userType", user.isAdmin());

            request.setAttribute("userObj", user);

            response.sendRedirect("FoodController.do");
        }
    }

}
