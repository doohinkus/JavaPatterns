package Decorator;

public abstract class BeverageDecorator implements Beverage{
    protected Beverage beverage;
    public BeverageDecorator(Beverage beverage){
this.beverage = beverage;
    }
  @Override
    public int getCost(){
      return this.beverage.getCost();
  }
  public String getDescription(){
return this.beverage.getDescription();
  }
}
