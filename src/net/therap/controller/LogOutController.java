package net.therap.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: farhan
 * Date: 4/27/12
 * Time: 2:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class LogOutController extends HttpServlet {
    private static final Logger log = LoggerFactory.getLogger(LoginController.class);


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession(false);
        if (session != null)
            session.invalidate();
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);

    }
}
