package DependencyInversion;

public class Skrill implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paying with Skrill " + amount);
    }
}
