package net.therap.service;

import net.therap.dao.VoteDao;
import net.therap.dao.VoteDaoImpl;
import net.therap.domain.Voting;

import java.sql.SQLException;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: farhan
 * Date: 4/25/12
 * Time: 5:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class VoteServiceImpl implements VoteService {


    public void setVoteCount(int userId, int foodId, Date votingDate){
        //To change body of implemented methods use File | Settings | File Templates.
        Voting vote = new Voting(userId, foodId, votingDate);
        VoteDao voteDao = new VoteDaoImpl();
        voteDao.setVoteCount(vote);

    }
}
