package LiskovSubstituionPrinciple;

public class FuelCar implements FuelVehicle{
    @Override
    public void speed(){
       System.out.println("Speed changes...");
    }

    @Override
    public void addFuel(){
        System.out.println("Add fuel...");
    }
}
