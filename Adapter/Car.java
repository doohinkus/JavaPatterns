package Adapter;

public class Car implements Motor{
    @Override
    public void accelerate() {
        System.out.println("Car accellerating...");
    }
}
