package Factory;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("Cat is eating...");
    }

    @Override
    public void noise() {
        System.out.println("Cat is meowing....");

    }
}
