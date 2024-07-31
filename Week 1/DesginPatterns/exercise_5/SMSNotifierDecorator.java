package exercise_5;

public class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void Send(String message) {
        super.Send(message);
        SendSMS(message);
    }

    private void SendSMS(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
