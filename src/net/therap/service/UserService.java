package net.therap.service;

import net.therap.domain.User;

import java.sql.SQLException;


/**
 * @author misbah
 */
public interface UserService {
   // void save(User user);

   // User get(int userId);

    User getUserByUserNameAndPassword(String userName, String password) throws ClassNotFoundException, SQLException;
}
