package StockExchange;

public class BuyStock implements Watcher{
    private float price;
    private Stock stock;

   public BuyStock(Stock stock){
        this.stock = stock;
        this.stock.addWatcher(this);
   }

    public BuyStock() {

    }

    @Override
    public void update(float price) {
      if(price < 98) System.out.println("Buying stock, price is low ...");
    }
}
