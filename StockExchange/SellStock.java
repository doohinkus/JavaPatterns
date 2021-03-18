package StockExchange;

public class SellStock implements Watcher{

    private float price;
    private StockController stockController;

    public SellStock(StockController stockController){
        this.stockController = stockController;
        this.stockController.addWatcher(this);
    }

    public SellStock() {

    }

    @Override
    public void update(float price) {
        if(price > 100) System.out.println("Selling stock, price is too high ...");
    }
}
