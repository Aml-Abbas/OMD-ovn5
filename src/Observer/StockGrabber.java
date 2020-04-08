package Observer;

import java.util.ArrayList;


public class StockGrabber implements Subject{
    ArrayList<Observer> observers;
    double IBM,AAPL, GOOG;

    public StockGrabber(){
        observers= new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        System.out.println("Observer " + observer.getID() + " added");
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        System.out.println("Observer " + observer.getID() + " removed");
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: observers){
            observer.update(IBM, AAPL, GOOG);
        }
    }

    public  void setIBMPrice(double price){
        IBM= price;
        notifyObserver();
    }
    public  void setAAPLPrice(double price){
        AAPL= price;
        notifyObserver();
    }
    public  void setGOOGPrice(double price){
        GOOG= price;
        notifyObserver();
    }
}
