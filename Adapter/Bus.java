package Adapter;

public class Bus implements Motor{
    @Override
    public void accelerate() {
        System.out.println("Bus is accelerating ...");
    }
}
