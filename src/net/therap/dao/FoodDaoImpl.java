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
    public List<Food> getFoodList() throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@db102:1521:THERAP", "trainee", "pass321");

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from FMP_FOODS");

        List<Food> foodList = new ArrayList<Food>();

        while (rs.next()) {
            foodList.add(new Food(rs.getString("FOOD_NAME"), rs.getInt("FOOD_ID"), rs.getInt("COUNT")));
        }

        return foodList;
    }

}
