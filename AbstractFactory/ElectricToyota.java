package AbstractFactory;

public class ElectricToyota implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling ELECTRIC toyota");
    }
}
