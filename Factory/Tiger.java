package Factory;

public class Tiger implements Animal{
    @Override
    public void eat() {
        System.out.println("Tiger is eating...");
    }

    @Override
    public void noise() {
        System.out.println("Tiger is meowing....");

    }
}
