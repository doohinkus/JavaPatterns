package Adapter;

public class BicycleAdapter implements Motor{
    private Bicycle bicycle;
    public BicycleAdapter(Bicycle bicycle){
        this.bicycle = bicycle;
    }

    // the adapter turns the bicyle into a vehicle
    @Override
    public void accelerate() {
      bicycle.go();
    }
}
