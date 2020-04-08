package AnimalPlay;

import java.awt.event.MouseAdapter;

public class AnimalMain {
    public static void main(String [] args){

        Animal twetty= new Bird("Twetty");
        Animal Max= new Dog("Max");
        twetty.showFlyAbility();
        Max.showFlyAbility();
        twetty.setCantFly();
        twetty.showFlyAbility();
    }
}
