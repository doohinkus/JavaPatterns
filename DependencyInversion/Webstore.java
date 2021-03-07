package DependencyInversion;

public class Webstore {
    private PaymentHandler controller;
//    PaymentHandler paymentHandler = new PaymentHandler(new Skrill());
//        paymentHandler.makePayment(23.12);
    public Webstore(){
        controller = new PaymentHandler();
        controller.setPaymentMethod(new Skrill());
    }

    public void pay(double amount){
        controller.makePayment(amount);
    }
}
