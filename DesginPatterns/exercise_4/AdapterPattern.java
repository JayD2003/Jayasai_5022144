package exercise_4;

public class AdapterPattern {
    public static void main (String args[])
    {
        PhonePe phonePe = new  PhonePe();
        Gpay Gpay = new Gpay();
        
        PaymentProcessor PaytmProcessor = new PhonePeAdapter(phonePe) ;
        PaymentProcessor GpayProcessor = new GpayAdapter(Gpay);
        
        PaytmProcessor.ProcessPayment(120.75);
        GpayProcessor.ProcessPayment(160.56);
    }
}
