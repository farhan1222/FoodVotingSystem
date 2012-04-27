package net.therap.dao;

import net.therap.controller.UserController;
import net.therap.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

/**
 * Created by IntelliJ IDEA.
 * User: farhan
 * Date: 4/23/12
 * Time: 1:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserDaoImpl implements UserDao {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);


    public void save(User user) {

    }

    public User get(int userId) {
        return null;
    }

    public User getUserByUserName(String userName) throws SQLException, ClassNotFoundException {

        return null;
    }

    public User getUserByUserNameAndPassword(String userName, String password) throws SQLException, ClassNotFoundException {


        DatabaseAccessTemplate databaseAccessTemplate = new DatabaseAccessTemplate();

        Connection con = databaseAccessTemplate.openConnection();

        //ResultSet rs = databaseAccessTemplate.queryForObject("select * from FMP_USERS  where USER_NAME = ? and  PASSWORD= ? ", userName, password);
        ResultSet rs = databaseAccessTemplate.queryForObject("select * from FMP_USERS  where USER_NAME = '"+ userName +"' and  PASSWORD = '" + password+ "'");

        User user = null;

        while (rs.next()) {
            user = new User(rs.getString("USER_NAME"), rs.getString("PASSWORD"), Integer.parseInt(rs.getString("FLAG")),
                    Integer.parseInt(rs.getString("USER_ID")));
        }
        //System.out.println( user.isAdmin());

        //assert user != null;
        databaseAccessTemplate.closeConnection();
        return user;


    }


}
