import AbstractFactory.*;
import AlgorithmQuestions.AIInterviewQuestions;
import AlgorithmQuestions.InterviewQuestionProcessor;
import BetterSingleton.BetterSingleton;
import Builder.Person;
import Builder.Student;
import Command.*;
//import CommandII.Algorithm;
import DependencyInversion.*;
import Factory.AlgorithmFactory;
import Factory.Animal;
import Factory.AnimalFactory;
import Factory.AnimalType;
import FunctionalProgramming.FPProcessor;
import FunctionalProgramming.Recursion;
import Iterator.Iterator;
import Iterator.NameRepository;
import LiskovSubstituionPrinciple.*;
import Observer.WeatherObserver;
import Observer.WeatherStation;
import SingleResponsibility.MergeSort;
import SingleResponsibility.Sorter;
import SingleResponsibility.SorterManager;
import SingleResponsibilityII.InputProcessor;
import SingleResponsibilityII.Operation;
import SingleResponsibilityII.Pair;
import SingleResponsibilityII.ViolationChecker;
import Singleton.Downloader;
import StockExchange.*;
import Strategy.Add;
import Strategy.Manager;
import Strategy.Multiply;
import Strategy.Subtract;
import StrategyImage.Laptop;
import StrategyImage.RenderManager;
import StrategyImage.TV;
import Template.Algorithm;
import Template.BubbleSort;
import Template.InsertionSort;
import VisitorPattern.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String [] args){
        Book book1 = new Book ("Rp", 127);

        // SINGLE RESPONSIBILITY & OPEN CLOSED PRINCNPLE
        SorterManager sorterManager = new SorterManager();
        // USAGE
        sorterManager.sort(new MergeSort());
// single responsibility II
        Pair pair = InputProcessor.process();
        if(!ViolationChecker.isValid(pair)){
            System.out.println(" Not kewl, enter numbers");
            return;
        }
        int firstInt = Operation.numberize(pair.getFirst());
        int secondInt = Operation.numberize(pair.getSecond());

        System.out.println(
                "The sum is " +
                Operation.execute(firstInt, secondInt)
        );
//OPEN CLOSED PRINCIPLE
        InterviewQuestionProcessor.process(new AIInterviewQuestions());
        FPProcessor.ask(new Recursion());


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

//        PaymentHandler paymentHandler = new PaymentHandler(new Skrill());
//        paymentHandler.makePayment(23.12);
        Webstore store = new Webstore();
        store.pay(12.23);
// Strategy pattern
        Manager manager = new Manager();
        manager.setStrategy(new Subtract());
        manager.operation(3192,123);

        RenderManager renderManager= new RenderManager();
        renderManager.setRenderer(new TV());
        renderManager.render();


        // Observer pattern
        WeatherStation station = new WeatherStation();
        WeatherObserver observer = new WeatherObserver(station);

        station.setHumidity(300);
        station.setPressure(57);
        station.setTemperature(68);

        StockExchange stockExchange = new StockExchange();
        stockExchange.addWatcher(new BuyStock());
        stockExchange.addWatcher(new SellStock());

        stockExchange.start();
        // < 95 buy
        // > 105 sell


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
// VISITOR pattern
        List<ShoppingItem> item = new ArrayList<>();
        item.add(new Table("desk", 12.34));
        item.add(new Table("desktop", 11.34));
        item.add(new Chair("folding", 4.56));
        double sum = 0.00;
        ShoppingCartVisitor shoppingCart = new ShoppingCart();
        for(ShoppingItem shoppingItem : item){
            sum = sum + shoppingItem.accept(shoppingCart);
        }
        System.out.println("The total is " + sum);
        // Singleton only one object see below
        Downloader d1 = Downloader.getInstance();
        Downloader d2 = Downloader.getInstance();
        d1.startDownload();
        d2.startDownload();

        System.out.println(d1 == d2);
// Better singleton
        BetterSingleton.INSTANCE.setCounter(17);
        System.out.println(BetterSingleton.INSTANCE.getCounter());
// Factory
        Sorter algorithm = AlgorithmFactory.createSorter(AlgorithmFactory.MERGE_SORT);
        algorithm.sort();
        Animal animal = AnimalFactory.getAnimal(AnimalType.DOG);
        animal.eat();
        animal.noise();

        AbstractFactory carFactory = FactoryProducer.getFactory("PETROL");
        carFactory.getCar("FORD").assemble();
        //Builder MUST BUILD the person

        Person p = new Person.Builder("Jim", "gasdf@gmail.com")
                .setAge(27)
                .setHobby("swimming")
                .setAddress("some address")
                .build();
        Person d = new Person.Builder("Jack", "pudir@gmail.com")
                .setAge(29)
                .setAddress("some other address")
                .setHobby("electronics")
                .build();

        Student danny = new Student.
                Builder("Danny", "Stanford")
                .setAge(23)
                .build();
        System.out.println(p + "" + d + " " + danny);
    }
}
