package StockExchange;

public interface StockController {
    public void addWatcher(Watcher watcher);
    public void notifyStocks();
}
