package exercise_5;

public class NotifierDecorator implements Notifier{
    protected Notifier wrappedNotifier;

    public NotifierDecorator(Notifier notifier) {
        this.wrappedNotifier = notifier;
    }

    @Override
    public void Send(String message) {
        wrappedNotifier.Send(message);
    }
}
