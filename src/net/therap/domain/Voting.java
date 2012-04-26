package net.therap.domain;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: farhan
 * Date: 4/25/12
 * Time: 5:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class Voting {

    private int userId;
    private int foodId;
    private Date votingDate;

    public Voting(int userId, int foodId, Date votingDate) {

        this.userId = userId;
        this.foodId = foodId;
        this.votingDate = votingDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getVotingDate() {
        return votingDate;
    }

    public void setVotingDate(Date votingDate) {
        this.votingDate = votingDate;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

}
