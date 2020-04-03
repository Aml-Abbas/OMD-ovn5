package u3;

public class Milk extends Topping {

    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public double getCost() {
        return drink.getCost() + 1;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " milk";
    }
}
