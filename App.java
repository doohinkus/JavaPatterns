import Command.*;
//import CommandII.Algorithm;
import DependencyInversion.DatabaseHandler;
import DependencyInversion.MySQLDb;
import DependencyInversion.OracleDb;
import Iterator.Iterator;
import Iterator.NameRepository;
import LiskovSubstituionPrinciple.*;
import Observer.WeatherObserver;
import Observer.WeatherStation;
import SingleResponsibility.MergeSort;
import SingleResponsibility.SorterManager;
import Strategy.Add;
import Strategy.Manager;
import Strategy.Multiply;
import Strategy.Subtract;
import Template.Algorithm;
import Template.BubbleSort;
import Template.InsertionSort;

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

// Dependecncy Inversion we INJECT the db we want to handle
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


        // Command pattern
        Switcher switcher = new Switcher();
        Light light = new Light();

        TurnOnCommand onCommand = new TurnOnCommand(light);
        TurnOffCommand offCommand = new TurnOffCommand(light);
        DimCommand dimCommand = new DimCommand(light);

        switcher.addCommand(onCommand);
        switcher.addCommand(offCommand);
        switcher.addCommand(dimCommand);

        switcher.executeCommands();

        // Command II
//        final Algorithm algorithm = new Algorithm();
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                algorithm.produce();
//            }
//        });
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                algorithm.consume();
//            }
//        });
//
//        t1.start();
//        t2.start();
// iterator
        NameRepository nameRepository = new NameRepository();
        for(Iterator iter = nameRepository.getIterator(); iter.hasNext();){
          String name = (String) iter.next();
          System.out.println(name);
        }


        // TEMPLATE pattern
        int numbers[] = {1,3,4,5,6,7,23,123,2,5};
        Algorithm sortAlgorithm = new InsertionSort(numbers);
        sortAlgorithm.sort();


    }
}
