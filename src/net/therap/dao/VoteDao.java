package net.therap.dao;

import net.therap.domain.Voting;

import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: farhan
 * Date: 4/25/12
 * Time: 5:24 PM
 * To change this template use File | Settings | File Templates.
 */
public interface VoteDao {
    void setVoteCount(Voting vote);
}
