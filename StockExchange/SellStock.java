package StockExchange;

public class SellStock implements Watcher{

    private float price;
    private Stock stock;

    public SellStock(Stock stock){
        this.stock = stock;
        this.stock.addWatcher(this);
    }

    public SellStock() {

    }

    @Override
    public void update(float price) {
        if(price > 100) System.out.println("Selling stock, price is too high ...");
    }
}
