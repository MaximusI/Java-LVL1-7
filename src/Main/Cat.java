package Main;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
        if (p.getFood() > 0 && p.getFood() - appetite >= 0)
            satiety = true;
    }

    public boolean isSatiety() {
        return satiety;
    }
}
