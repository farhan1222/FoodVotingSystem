package net.therap.controller;

import net.therap.service.VoteService;
import net.therap.service.VoteServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: farhan
 * Date: 4/25/12
 * Time: 5:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class VoteController extends HttpServlet {
    private static final Logger log = LoggerFactory.getLogger(VoteController.class);
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        int userId = Integer.parseInt(String.valueOf(session.getAttribute("userId")));

        VoteService voteService = new VoteServiceImpl();

        //log.debug("pritom");
        //log.debug(request.getParameter("food"));


        try {
            voteService.setVoteCount(userId, Integer.parseInt(request.getParameter("food")), new Date());

            //voteService.setVoteCount(request.getParameter("food"), userId, Integer.parseInt(request.getParameter("food.foodId")), new Date());
            //voteService.setVoteCount("honey musterd chicken fingers", 2, 1, new Date());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (SQLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        response.sendRedirect("FoodController.do");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
