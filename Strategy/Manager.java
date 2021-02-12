package Strategy;

public class Manager implements Strategy{
    private Strategy strategy;
    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
    @Override
    public void operation(int a, int b){
        this.strategy.operation(a, b);
    }
}
