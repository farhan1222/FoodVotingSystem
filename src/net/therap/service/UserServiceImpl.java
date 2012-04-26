package net.therap.service;

import net.therap.dao.UserDaoImpl;
import net.therap.domain.User;

import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: farhan
 * Date: 4/23/12
 * Time: 1:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserServiceImpl implements UserService {


    public User getUserByUserNameAndPassword(String userName, String password) throws ClassNotFoundException, SQLException {

        UserDaoImpl userService = new UserDaoImpl();

        return userService.getUserByUserNameAndPassword(userName, password);

    }

   /* public static void  main( String args[]){
        UserServiceImpl usr = new UserServiceImpl();
        User user=null;
        try{



          user = usr.getUserByUserNameAndPassword("pritom", "therap");
        }
        catch (NullPointerException e){


        } catch (ClassNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (SQLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        System.out.println(user.getUserName());


    }*/

}
