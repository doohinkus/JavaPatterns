package Strategy;

public class Manager implements Strategy{
    // abstract layer that connects high level modules to low level modules
    // COMPOSITION, not inheritence
    private Strategy strategy;
    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }


    @Override
    public void operation(int a, int b){
        this.strategy.operation(a, b);
    }
}
