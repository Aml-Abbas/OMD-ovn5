package u3;

public class Main {
    public static void main(String[] args) {
        Drink drink = new Sugar(new Milk(new Milk(new Coffee())));
        // Drink drink1= new Coffee();
        //System.out.println(drink1.getDescription());
        //System.out.println(drink1.getCost());

        System.out.println(drink.getDescription());
        System.out.println(drink.getCost());
    }
}
