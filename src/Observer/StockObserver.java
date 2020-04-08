package Observer;

public class StockObserver implements Observer{
    double IBM, AAPL, GOOG;
    int observerId;
    static  int idObserver=0;
    Subject stockGrabber;

    public StockObserver( Subject stockGrabber){
        this.stockGrabber= stockGrabber;
        idObserver++;
        observerId=idObserver;
        System.out.println("New Observer added to stockGrabber with id: " + this.observerId);
        stockGrabber.register(this);

    }
    @Override
    public void update(double IBM, double AAPL, double GOOG) {
        this.IBM=IBM;
        this.AAPL=AAPL;
        this.GOOG=GOOG;
        printThePrices();

    }

    private void printThePrices() {
        System.out.println(observerId + "\nIBM: " + IBM + "\nAAPL: " +AAPL+  "\nGOOG: " +GOOG);
    }

    @Override
    public int getID() {
        return observerId;
    }
}
