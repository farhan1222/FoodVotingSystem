package net.therap.service;

import net.therap.dao.FoodDao;
import net.therap.dao.FoodDaoImpl;
import net.therap.domain.Food;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: farhan
 * Date: 4/23/12
 * Time: 4:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class FoodServiceImpl implements FoodService {
    public List<Food> getFoodList(int userId)  {
        FoodDao foodDao = new FoodDaoImpl();


        return foodDao.getFoodList(userId);
    }
}
