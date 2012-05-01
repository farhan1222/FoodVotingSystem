package net.therap.domain;

/**
 * Created by IntelliJ IDEA.
 * User: farhan
 * Date: 4/23/12
 * Time: 4:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class Food {
    private String foodName;
    private int foodId;
    private String foodType;
    private int count;
    private int voted;

    public Food() {
    }

    public Food(String foodName, int foodId, String foodType, int count, int voted) {
        this.foodName = foodName;
        this.foodId = foodId;
        this.foodType = foodType;
        this.count = count;
        this.voted = voted;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getVoted() {
        return voted;
    }

    public void setVoted(int voted) {
        this.voted = voted;
    }
}
