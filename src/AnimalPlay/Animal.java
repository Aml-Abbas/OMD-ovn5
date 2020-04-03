package AnimalPlay;

public class Animal {
    String animalName;
    Flys toFly;

    public Animal(String name){
        animalName= name;
        toFly= new CanFly();
    }

    public void setFlys(Flys newFly){
        toFly = newFly;
    }
    public void showFlyAbility(){
        System.out.print(animalName+" ");
        toFly.Fly();
    }
}
