package StockExchange;

public class BuyStock implements Watcher{
    private float price;
    private StockController stockController;

   public BuyStock(StockController stockController){
        this.stockController = stockController;
        this.stockController.addWatcher(this);
   }

    public BuyStock() {

    }

    @Override
    public void update(float price) {
      if(price < 98) System.out.println("Buying stock, price is low ...");
    }
}
