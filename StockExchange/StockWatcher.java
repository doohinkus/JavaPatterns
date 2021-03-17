package StockExchange;

public class StockWatcher implements Watcher{
    private float price;
    private Stock stock;
    public StockWatcher(Stock stock){
      this.stock = stock;
      this.stock.addWatcher(this);
    }

    public StockWatcher() {

    }

    @Override
    public void update(float price) {
       sellStock(price);
       buyStock(price);

    }
    public void sellStock(float price){
        if(price > 100) System.out.println("Selling stock .... ");
    }
    public void buyStock(float price){
        if(price < 98) System.out.println("Buying stock .... ");
    }
}
