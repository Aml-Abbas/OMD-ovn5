package Observer;

public class ObserverMain {
    public static void main (String[] args){

        StockGrabber stockGrabber= new StockGrabber();
        Observer observer1 = new StockObserver(stockGrabber);
        stockGrabber.setIBMPrice(200);
        stockGrabber.setAAPLPrice(201);
        stockGrabber.setGOOGPrice(202);

        Observer observer2= new StockObserver(stockGrabber);
        stockGrabber.setIBMPrice(230);
        stockGrabber.setAAPLPrice(241);
        stockGrabber.setGOOGPrice(252);

        stockGrabber.unregister(observer1);
        stockGrabber.setIBMPrice(200);
        stockGrabber.setAAPLPrice(200);
        stockGrabber.setGOOGPrice(200);

        Runnable run1= new GetTheStock(stockGrabber, 2, "IBM", 123.88);
        Runnable run2= new GetTheStock(stockGrabber,2,"AAPL", 234.88);
        Runnable run3= new GetTheStock(stockGrabber, 2, "GOOG", 345.98);

        new Thread(run1).start();
        new Thread(run2).start();
        new Thread(run3).start();

    }
}
