package u3;

public class Chocolate implements Drink {
    @Override
    public double getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Chocolate";
    }
}
