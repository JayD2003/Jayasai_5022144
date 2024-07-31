package exercise_5;

public class SlackNotifierDecorator extends NotifierDecorator{
    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    public void Send(String message) {
        super.Send(message);
        SendSlack(message);
    }

    private void SendSlack(String message) {
        System.out.println("Sending Slack message: " + message);
    }
}
