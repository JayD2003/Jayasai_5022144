package exercise_4;

public  class PhonePeAdapter implements PaymentProcessor {
    private PhonePe phonePe;
    public PhonePeAdapter(PhonePe phonePePhonePe){
        this.phonePe = phonePePhonePe;
    }
    
    public void ProcessPayment(double amt){
        phonePe.pay(amt);
    }
}