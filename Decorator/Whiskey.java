package Decorator;

public class Whiskey extends BeverageDecorator {
    private Beverage beverage;
    public Whiskey(Beverage beverage){
        super(beverage);
        this.beverage = beverage;
    }

    @Override
    public int getCost(){
        // assumes whiskey is 7 bucks
        return this.beverage.getCost() + 7;
    }
    public String getDescription(){
        return this.beverage.getDescription() + " whiskey ";
    }
}
