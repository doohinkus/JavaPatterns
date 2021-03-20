package Decorator;

public class Water implements Beverage {


    @Override
    public int getCost(){
        // assumes water is 1 buck
        return 1;
    }
    public String getDescription(){
        return " water ";
    }
}
