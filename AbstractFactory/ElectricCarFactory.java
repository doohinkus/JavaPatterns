package AbstractFactory;

class ElectricCarFactory implements AbstractFactory{
    @Override
    public Car getCar(String type) {
        switch(type){
            case "FORD":
                return new ElectricFord();
            case "TOYOTA":
                return new ElectricToyota();
        }
        return null;
    }
}
