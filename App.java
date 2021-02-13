import DependencyInversion.DatabaseHandler;
import DependencyInversion.MySQLDb;
import DependencyInversion.OracleDb;
import LiskovSubstituionPrinciple.*;
import Observer.WeatherObserver;
import Observer.WeatherStation;
import SingleResponsibility.MergeSort;
import SingleResponsibility.SorterManager;
import Strategy.Add;
import Strategy.Manager;
import Strategy.Multiply;
import Strategy.Subtract;

public class App {
    public static void main(String [] args){
        Book book1 = new Book ("Rp", 127);

        // SINGLE RESPONSIBILITY & OPEN CLOSED PRINCNPLE
        SorterManager sorterManager = new SorterManager();
        // USAGE
        sorterManager.sort(new MergeSort());


        // LISKOV subsitution principle
        // using parent type does NOT break
        ElectricCar prius = new ElectricCar();
        FuelCar mazda = new FuelCar();

        // USING parent type does NOT break the program
        ElectricVehicle tesla = new ElectricCar();
        FuelVehicle tacoma = new FuelCar();
        // USAGE
        prius.speed();
        mazda.addFuel();

        tesla.chargeVehicle();
        tacoma.speed();

//        Dependecncy Inversion we INJECT the db we want to handle
        DatabaseHandler databaseHandler = new DatabaseHandler(new OracleDb());
        databaseHandler.connect();
        databaseHandler.disconnect();
// Strategy pattern
        Manager manager = new Manager();
        manager.setStrategy(new Subtract());
        manager.operation(3192,123);


        // Observer pattern
        WeatherStation station = new WeatherStation();
        WeatherObserver observer = new WeatherObserver(station);

        station.setHumidity(300);
        station.setPressure(57);
        station.setTemperature(68);

    }
}
