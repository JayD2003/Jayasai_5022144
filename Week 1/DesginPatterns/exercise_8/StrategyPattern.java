package exercise_8;

public class StrategyPattern {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "Jayasai");
        paymentContext.setPaymentStrategy(creditCardPayment);
        paymentContext.pay(250.75);

        PaymentStrategy payPalPayment = new PayPalPayment("jayxluffy@gmail.com");
        paymentContext.setPaymentStrategy(payPalPayment);
        paymentContext.pay(150.00);
    }
}
