package net.therap.controller;

import net.therap.domain.Food;
import net.therap.service.FoodService;
import net.therap.service.FoodServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: farhan
 * Date: 4/23/12
 * Time: 3:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class FoodController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

        HttpSession session = request.getSession(false);
        int id = Integer.parseInt(session.getAttribute("userId").toString());
        String userType = session.getAttribute("userType").toString();


        FoodService foodService = new FoodServiceImpl();
        List<Food> foodList = null;
        foodList = foodService.getFoodList(id);

        List<Food> breakfastList = new ArrayList<Food>();
        List<Food> lunchList = new ArrayList<Food>();
        List<Food> dinnerList = new ArrayList<Food>();

        if (foodList != null) {
            for (Food f : foodList) {
                if (f.getFoodType().equals("Breakfast")) {
                    breakfastList.add(f);
                } else if (f.getFoodType().equals("Dinner")) {
                    dinnerList.add(f);
                } else if (f.getFoodType().equals("Lunch")) {
                    lunchList.add(f);
                }
            }
        }


        request.setAttribute("foodList", foodList);
/*        request.setAttribute("breakfastList",breakfastList);
        request.setAttribute("lunchList",lunchList);
        request.setAttribute("dinnerList",dinnerList); */
        request.setAttribute("breakfastFlag",breakfastList.get(0).getVoted());
        request.setAttribute("lunchFlag",lunchList.get(0).getVoted());
        request.setAttribute("dinnerFlag",dinnerList.get(0).getVoted());


        request.setAttribute("userName", session.getAttribute("userName"));






        RequestDispatcher view;

        view = userType.equals("0") ? request.getRequestDispatcher("/WEB-INF/jsp/user/user.jsp") : request.getRequestDispatcher("/WEB-INF/jsp/user/admin.jsp");


        /*if (userType.equals("0")) {
            view = request.getRequestDispatcher("/WEB-INF/jsp/user/show.jsp");

        }

        else if (userType.equals("1")) {
            view = request.getRequestDispatcher("/WEB-INF/jsp/user/show.jsp");
        }*/

        try {
            view.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }
}
