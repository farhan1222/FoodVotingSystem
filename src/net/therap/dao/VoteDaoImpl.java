package net.therap.dao;

import net.therap.domain.Voting;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: farhan
 * Date: 4/25/12
 * Time: 5:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class VoteDaoImpl implements VoteDao {
    public void setVoteCount(Voting vote) throws ClassNotFoundException, SQLException {
/*        Class.forName("oracle.jdbc.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@db102:1521:THERAP", "trainee", "pass321");

        Statement stmt = con.createStatement();*/

        DatabaseAccessTemplate databaseAccessTemplate = new DatabaseAccessTemplate();

        Connection con = databaseAccessTemplate.openConnection();

        databaseAccessTemplate.updateQuery("insert into FMP_USERS_FOODS (USER_ID,FOOD_ID) values (?,?)",
                vote.getUserId(), vote.getFoodId());
        databaseAccessTemplate.commit();
        databaseAccessTemplate.closeConnection();

        con = databaseAccessTemplate.openConnection();
        databaseAccessTemplate.updateQuery("update FMP_FOODS set count = count + 1 where FOOD_ID = ?", vote.getFoodId());

        databaseAccessTemplate.commit();
        databaseAccessTemplate.closeConnection();
        //stmt.executeUpdate("insert into FMP_USERS_FOODS values (" + vote.getUserId() + ", " + vote.getFoodId() + ", SYSDATE )");
        //stmt.executeUpdate("update FMP_FOODS set count = count + 1 where FOOD_ID = " + vote.getFoodId());

        //stmt.executeUpdate("insert into FMP_USERS_FOODS values (" + vote.getUserId() + ", " + vote.getFoodId() + ", " + new java.sql.Date (vote.getVotingDate().getTime()) + ")");
        //stmt.executeUpdate("insert into FMP_USERS_FOODS values (1, 1, SYSDATE)");

    }
}
