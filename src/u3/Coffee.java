package u3;

public class Coffee implements Drink {



    @Override
    public double getCost() {
        return 5;
    }

    @Override
    public String getDescription() {
        return "Coffee";
    }
}
