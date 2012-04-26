package net.therap.service;

import net.therap.domain.Food;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: farhan
 * Date: 4/23/12
 * Time: 4:25 PM
 * To change this template use File | Settings | File Templates.
 */
public interface FoodService {
    List<Food> getFoodList(int userId) throws SQLException, ClassNotFoundException;
}
