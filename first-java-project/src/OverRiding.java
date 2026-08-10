
class Payment {
    double amount;
    
    public void processPayment(double amount) {
        this.amount = amount;
        System.out.println("Processing payment ");
    }
}
class CreditCardPayment extends Payment{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment + additional 2.5$ fee: " + (amount + 2.5));
    }
}

class PaypalPayment extends Payment{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment + 3% paypal payment fee: " + (amount * (1 + (3.0/100.0))));
    }
}

public class OverRiding {

    /**
     * the main reason we use overriding is to implement polymorphism where many forms run at the same time
     * for example here if we didn't use overriding, we would ned to use the if statements 
     * @param args
     */
    public static void main(String[] args) {
        Payment obj = new PaypalPayment();
        obj.processPayment(100);
    }

}
