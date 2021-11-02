package CS203Course.Lab.Lab_1_1.Question_12;

public class MealCard {

    private int points;

    public MealCard() {
        this.points = 100;
    }

    public MealCard(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int balancePoints) {
        this.points = points;
    }

    //Checking student's points availability and making purchase
    public void makePurchase(int itemPrice){
        double balance = 0;
        if (this.points > itemPrice) {
            balance = this.points - itemPrice;
        } else {
            System.out.println("You don't have enough points to purchase of food.");
        }
        System.out.println("You balance after your last purchase " + balance);
    }

    //buying extra points
    public void buyPoint(int amount) {
        System.out.println("You have "+(points + amount)+" Points in your Meal Card.");

    }

}
