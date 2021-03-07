package DependencyInversion;

public class Paypal implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paying with PayPal " + amount);
    }

}
