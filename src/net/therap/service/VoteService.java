package net.therap.service;

import net.therap.domain.Voting;

import java.sql.SQLException;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: farhan
 * Date: 4/25/12
 * Time: 5:04 PM
 * To change this template use File | Settings | File Templates.
 */
public interface VoteService {
    void setVoteCount(int userId,int foodId,Date votingDate) throws ClassNotFoundException, SQLException;
}
