package CS203Course.Lab.Lab_1.Question_10.myutil;

public class MealCard {

    private int balancePoints;
    private Student student;

    public MealCard(Student student) {
        this.student = student;
    }

    public MealCard(int balancePoints, Student student) {
        this.balancePoints = balancePoints;
        this.student = student;
    }

    public int getBalancePoints() {
        return balancePoints;
    }

    public void setBalancePoints(int balancePoints) {
        this.balancePoints = balancePoints;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    //Checking student's points availability
    public int checkPoints(int givenPoint) {

        if (givenPoint > 0) {
            this.balancePoints = givenPoint;
        } else if (givenPoint < 0) {
            System.out.println("The purchase of food items is not Allowed");
        } else {
            this.balancePoints = 100;
        }
        return this.balancePoints;
    }

    //buying food
    public void buyFood(int foodCost, int givenPoint) {

        //getting the balance the student have any
        int balance = checkPoints(givenPoint);
        int balanceAfter = 0;
        //checking if he can afford to buy the food
        if(balance > foodCost){
            balanceAfter = balance - foodCost;
        } else{
            System.out.println("You don't have enough points to buy food at this time.");
        }
        System.out.println("Your food cost " + foodCost + " and you have balance : " + balanceAfter);
    }

    //buying extra points
    public int buyExtraPoint(int extraPoint) {

        int buyExtra = this.balancePoints + extraPoint;
        return buyExtra;
    }


}
