package AbstractFactory;

public class PetrolCarFactory implements AbstractFactory{
    @Override
    public Car getCar(String type) {
        switch(type){
            case "FORD":
                return new PetrolFord();
            case "TOYOTA":
                return new PetrolToyota();
        }
        return null;
    }
}
