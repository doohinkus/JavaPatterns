package StockExchange;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StockControllerExchange implements StockController {
    private float price = 100;
    private Random random;
    private List<Watcher> stockList;
    public StockControllerExchange(){
        this.stockList = new ArrayList<>();
        random = new Random();
    }
    public void start(){
        while(true){
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            price = price + 2 * random.nextFloat() - 1;
            System.out.println(price);
            notifyStocks();


        }
    }
public void setPrice(float price){
        this.price = price;
        notifyStocks();
}
    @Override
    public void addWatcher(Watcher watcher) {
      this.stockList.add(watcher);
    }

    @Override
    public void notifyStocks() {
        for(Watcher watcher : this.stockList){
            watcher.update(price);

//            sellStock(price);
//            buyStock(price);

        }

    }
    public void sellStock(float price){
        if(price > 100) System.out.println("Selling stock .... ");
    }
    public void buyStock(float price){
        if(price < 98) System.out.println("Buying stock .... ");
    }

}
