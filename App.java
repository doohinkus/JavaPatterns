import LiskovSubstituionPrinciple.*;
import SingleResponsibility.MergeSort;
import SingleResponsibility.SorterManager;

public class App {
    public static void main(String [] args){
        Book book1 = new Book ("Rp", 127);
        SorterManager sorterManager = new SorterManager();
        sorterManager.sort(new MergeSort());

        // using parent type does NOT break
        ElectricCar prius = new ElectricCar();
        FuelCar mazda = new FuelCar();

       // USING parent type does NOT break the program
        ElectricVehicle tesla = new ElectricCar();
        FuelVehicle tacoma = new FuelCar();

        prius.speed();
        mazda.addFuel();

        tesla.chargeVehicle();
        tacoma.speed();

        book1.save();


    }
}
