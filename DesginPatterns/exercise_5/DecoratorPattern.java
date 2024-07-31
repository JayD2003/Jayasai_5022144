package exercise_5;

public class DecoratorPattern {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsAndEmailNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier slackSmsAndEmailNotifier = new SlackNotifierDecorator(smsAndEmailNotifier);

        System.out.println("Sending notifications via Email:");
        emailNotifier.Send("Hello via Email!");

        System.out.println("\nSending notifications via Email and SMS:");
        smsAndEmailNotifier.Send("Hello via Email and SMS!");

        System.out.println("\nSending notifications via Email, SMS, and Slack:");
        slackSmsAndEmailNotifier.Send("Hello via Email, SMS, and Slack!");
    }
}
