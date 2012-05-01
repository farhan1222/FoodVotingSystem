package net.therap.dao;

import net.therap.domain.Voting;
import net.therap.util.DatabaseAccessTemplate;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: farhan
 * Date: 4/25/12
 * Time: 5:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class VoteDaoImpl implements VoteDao {
    public void setVoteCount(Voting vote) {


        DatabaseAccessTemplate databaseAccessTemplate = new DatabaseAccessTemplate();

        //Connection con = databaseAccessTemplate.openConnection();

        String foodInsertQuery = "insert into FMP_USERS_FOODS (USER_ID,FOOD_ID,VOTINGDATE) values (?,?,?)";

        databaseAccessTemplate.updateQuery(foodInsertQuery, vote.getUserId(), vote.getFoodId(),new Date());

        String foodUpdateQuery = "update FMP_FOODS set count = count + 1 where FOOD_ID = ?";
        databaseAccessTemplate.updateQuery(foodUpdateQuery, vote.getFoodId());


    }
}
