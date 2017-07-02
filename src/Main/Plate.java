package Main;

public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        if (food - n >= 0)
        food -= n;
        else System.out.println("You not enought minerals - " + Math.abs(food - n));
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    public void addFood(int food){
        if (food >= 0)
            this.food += food;
        else
            System.out.println("Incorrect input of food count");
    }
}
