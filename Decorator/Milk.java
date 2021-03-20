package Decorator;

public class Milk extends BeverageDecorator {
    private Beverage beverage;
    public Milk(Beverage beverage){
        super(beverage);
        this.beverage = beverage;
    }

    @Override
    public int getCost(){
        // assumes milk is 3 bucks
        return this.beverage.getCost() + 3;
    }
    public String getDescription(){
        return this.beverage.getDescription() + " milk ";
    }
}
