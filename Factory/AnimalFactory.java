package Factory;

public class AnimalFactory {
    public static Animal getAnimal(AnimalType type){
        // FACTORY instantiates the classes
        switch(type){
            case TIGER:
                return new Tiger();
            case DOG:
                return new Dog();
            case CAT:
                return new Cat();
        }
        return null;
    }
}
