package net.therap.dao;

import net.therap.domain.Food;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: farhan
 * Date: 4/23/12
 * Time: 4:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class FoodDaoImpl implements FoodDao {
    public List<Food> getFoodList(int userId) throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@db102:1521:THERAP", "trainee", "pass321");

        Statement stmt = con.createStatement();
        //ResultSet rs = stmt.executeQuery("SELECT * FROM FMP_FOODS WHERE FOOD_ID NOT IN (SELECT FOOD_ID FROM FMP_USERS_FOODS WHERE USER_ID = " + userId + " AND VOTINGDATE != SYSDATE)");
        ResultSet rs2 = stmt.executeQuery("SELECT DISTINCT  FOOD_TYPE FROM FMP_FOODS minus ( SELECT  FOOD_TYPE  FROM FMP_FOODS where FOOD_ID IN ( SELECT FOOD_ID FROM FMP_USERS_FOODS WHERE USER_ID = "+ userId + " AND to_date(VOTINGDATE, 'dd/mm/yyyy') = to_date(sysdate, 'dd/mm/yyyy')))");

        List<String> allowedFood = new ArrayList<String>();
        while (rs2.next()) {
            allowedFood.add(rs2.getString("FOOD_TYPE"));

        }

        ResultSet rs = stmt.executeQuery("SELECT * FROM FMP_FOODS ");


        List<Food> foodList = new ArrayList<Food>();

        int voted = 1;

        while (rs.next()) {
            voted = 1;
            //   while (rs2.next()) {
            if (allowedFood.contains(rs.getString("FOOD_TYPE"))) {
                voted = 0;
            }
            //}//
            foodList.add(new Food(rs.getString("FOOD_NAME"), rs.getInt("FOOD_ID"), rs.getString("FOOD_TYPE"), rs.getInt("COUNT"), voted));

        }


        return foodList;
    }

}
//SELECT DISTINCT  FOOD_TYPE FROM FMP_FOODS minus (SELECT  FOOD_TYPE  FROM FMP_FOODS where FOOD_ID IN ( SELECT FOOD_ID FROM FMP_USERS_FOODS WHERE USER_ID = 1 AND VOTINGDATE = SYSDATE));
