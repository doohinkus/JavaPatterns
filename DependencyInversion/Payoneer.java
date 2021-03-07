package DependencyInversion;

public class Payoneer implements Payment{
    @Override
    public void pay(double amount) {
       System.out.println("Paying with Payoneer " + amount);
    }
}
