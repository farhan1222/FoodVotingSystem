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
import java.util.List;


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
             user = userService.getUserByUserNameAndPassword(request.getParameter("username"), request.getParameter("password"));
         } catch (ClassNotFoundException e) {
             e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
         } catch (SQLException e) {
             e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
         }

         pw.print(" from db" + user.getId() + " " + user.getUserName());

         HttpSession session = request.getSession();
         session.setAttribute("userId", user.getId());
         session.setAttribute("userName", user.getUserName());
         session.setAttribute("userType", user.isAdmin());



         //List food;
         //request.setAttribute("foodList", food);

         /*RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/jsp/user/show.jsp");

         view.forward(request,response);  */


         response.sendRedirect("FoodController.do");

     }

}
