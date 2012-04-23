package net.therap.dao;

import net.therap.domain.User;

import java.sql.SQLException;


public interface UserDao {
    void save(User user);

    User get(int userId);

    User getUserByUserName(String userName) throws SQLException, ClassNotFoundException;

    User getUserByUserNameAndPassword(String userName, String password) throws SQLException, ClassNotFoundException;
}
