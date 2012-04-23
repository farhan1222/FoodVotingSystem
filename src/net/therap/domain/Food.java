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
    private int count;

    public Food(String foodName, int foodId, int count) {
        this.foodName = foodName;
        this.foodId = foodId;
        this.count = count;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
