package StockExchange;

public interface Stock {
    public void addWatcher(Watcher watcher);
    public void notifyStocks();
}
