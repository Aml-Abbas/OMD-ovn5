package u3;

public abstract class Topping implements Drink{
    protected Drink drink;

    public Topping(Drink drink) {
        this.drink = drink;
    }
}
