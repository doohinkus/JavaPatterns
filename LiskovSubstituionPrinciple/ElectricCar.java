package LiskovSubstituionPrinciple;

public class ElectricCar implements ElectricVehicle{
    @Override
    public void speed(){
        System.out.println("Speeding ELECTRIC CAR");
    }

    @Override
    public void chargeVehicle(){
        System.out.println("Charging ELECTRIC vehicle...");
    }
}
