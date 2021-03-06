package net.therap.util;
/**
 * Created by IntelliJ IDEA.
 * User: ashraf
 * Date: 4/10/12
 * Time: 8:51 AM
 * To change this template use File | Settings | File Templates.
 */

import net.therap.controller.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

 import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;
import java.sql.*;

public class DatabaseAccessTemplate {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);


    Connection connection;
    String conString;
    String password;
    String userName;

    public DatabaseAccessTemplate() {

        this.conString = "jdbc:oracle:thin:@db102:1521:THERAP";
        this.password = "pass321";
        this.userName = "trainee";
    }

    public Connection openConnection() {
        Context initContext = null;
        try {

            /* Class.forName("oracle.jdbc.OracleDriver");
                        connection = DriverManager.getConnection(conString, userName, password);
            */
            initContext = new InitialContext();
            Context envContext = (Context) initContext.lookup("java:/comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
            connection = ds.getConnection();
        } catch (Exception exp) {
            log.debug("error in openconnection");

        }

        return connection;
    }

    public void closeConnection() {
        try {

            connection.close();

        } catch (Exception exp) {
            log.debug("error is  closeconnection");

        }

    }


    public void updateQuery(String query, Object... parameters) {

        Connection con = openConnection();
        PreparedStatement stmt = null;
        try {
            int i = 0;
            stmt = connection.prepareStatement(query);
            for (Object parameter : parameters) {

                i++;
                System.out.println(i);
                if (parameter instanceof String) {

                    stmt.setString(i, (String) parameter);

                } else if (parameter instanceof Integer) {

                    stmt.setInt(i, (Integer) parameter);

                }
                else if(parameter instanceof java.util.Date)
                {
                    stmt.setDate(i, new java.sql.Date(((java.util.Date)parameter).getTime()));
                }


            }
            stmt.executeUpdate();

        } catch (Exception exp) {
            log.debug("error in updatequery");

            //closeConnection(stmt);


        }
        commit();
        closeConnection(con);
    }

    void commit() {

        try {

            connection.commit();

        } catch (Exception exp) {


        }


    }

    public ResultSet queryForObject(String query) {


        Connection con = openConnection();


        ResultSet resultSet = null;
        Statement stmt;
        try {

            stmt = connection.createStatement();
            resultSet = stmt.executeQuery(query);
/*            while (resultSet.next()) {

                obj = rowMapper.mapLogRow(resultSet);
                dataList.add(obj);

            }
            return dataList;*/
        } catch (Exception exp) {
            log.debug("error in query forobject");

        }
        //closeConnection(con);
        return resultSet;


    }


    public static void closeConnection(Connection connection) {

        try {
            connection.close();
        } catch (Exception exp) {

        }

    }

    public static void closeStatement(Statement stmt) {

        try {
            stmt.close();
        } catch (Exception exp) {

        }

    }

    public static void closeResultSet(ResultSet resultSet) {

        try {
            resultSet.close();
        } catch (Exception exp) {

        }

    }
}
