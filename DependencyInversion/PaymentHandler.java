package DependencyInversion;

public class PaymentHandler {
    private Payment payment;
    private double amount;
    //    PaymentHandler paymentHandler = new PaymentHandler(new Skrill());

//    public PaymentHandler(Payment payment){
//        this.payment = payment;
//    }
    public void makePayment(double amount){
        this.payment.pay(amount);
    }
    public void setPaymentMethod(Payment payment){
        this.payment = payment;
    }
}
