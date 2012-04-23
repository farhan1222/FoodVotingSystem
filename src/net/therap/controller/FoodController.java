package net.therap.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by IntelliJ IDEA.
 * User: farhan
 * Date: 4/23/12
 * Time: 3:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class FoodController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.print("food controller ");
        HttpSession session = request.getSession(false);
        String id = session.getAttribute("userId").toString();
        String userType = session.getAttribute("userType").toString();
        pw.print(userType);

        RequestDispatcher view;

        view = userType.equals("0") ? request.getRequestDispatcher("/WEB-INF/jsp/user/show.jsp") : request.getRequestDispatcher("/WEB-INF/jsp/user/show.jsp");



        /*if (userType.equals("0")) {
            view = request.getRequestDispatcher("/WEB-INF/jsp/user/show.jsp");

        }

        else if (userType.equals("1")) {
            view = request.getRequestDispatcher("/WEB-INF/jsp/user/show.jsp");
        }*/

        view.forward(request, response);

    }
}
