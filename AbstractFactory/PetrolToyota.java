package AbstractFactory;

public class PetrolToyota implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling PETROL toyota");
    }
}
