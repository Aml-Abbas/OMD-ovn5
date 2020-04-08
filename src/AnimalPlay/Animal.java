package AnimalPlay;

public class Animal {
    String animalName;
    Flys toFly;

    public Animal(String name){
        animalName= name;
        toFly= new CanFly();
    }

    public void setCanFly(){
        toFly = new CanFly();
    }

    public void setCantFly(){
        toFly = new CantFly();
    }

    public void showFlyAbility(){
        System.out.print(animalName+" ");
        toFly.Fly();
    }
}
