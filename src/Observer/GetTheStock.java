package Observer;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable{

    // Could be used to set how many seconds to wait
    // in Thread.sleep() below

    // private int startTime;
    private String stock;
    private Double price;

    // Will hold reference to the StockGrabber object

    private Subject stockGrabber;

    public GetTheStock(Subject stockGrabber, int newStartTime, String newStock, double newPrice){
        this.stockGrabber = stockGrabber;
        // startTime = newStartTime;  Not used to have variable sleep time
        stock = newStock;
        price = newPrice;

    }

    public void run(){
        for(int i = 1; i <= 20; i++){
            try{
                // Sleep for 2 seconds
                Thread.sleep(2000);

                // Use Thread.sleep(startTime * 1000); to
                // make sleep time variable
            }
            catch(InterruptedException e)
            {}

            // Generates a random number between -.03 and .03
            double randNum = (Math.random() * (.06)) - .03;

            // Formats decimals to 2 places
            DecimalFormat df = new DecimalFormat("0.00");

            // Change the price and then convert it back into a double
            String priceString= df.format(price + randNum);

           // price =Double.valueOf("34567");

            if(stock == "IBM") ((StockGrabber) stockGrabber).setIBMPrice(price);
            if(stock == "AAPL") ((StockGrabber) stockGrabber).setAAPLPrice(price);
            if(stock == "GOOG") ((StockGrabber) stockGrabber).setGOOGPrice(price);

        }
    }

}