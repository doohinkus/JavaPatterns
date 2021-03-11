package AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch (type){
            case "ELECTRIC":
                return new ElectricCarFactory();
            case "PETROL":
                return new PetrolCarFactory();
        }
        return null;
    }
}
