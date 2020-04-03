package u3;

public class Sugar extends Topping {

    public Sugar(Drink drink) {
        super(drink);
    }

    @Override
    public double getCost() {
        return drink.getCost();
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " sugar";
    }
}
