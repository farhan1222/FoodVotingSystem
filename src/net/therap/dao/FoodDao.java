package net.therap.dao;

import net.therap.domain.Food;
import net.therap.domain.User;

import java.sql.SQLException;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: farhan
 * Date: 4/23/12
 * Time: 4:04 PM
 * To change this template use File | Settings | File Templates.
 */
public interface FoodDao {
    java.util.List<Food> getFoodList(int userId) ;
}
