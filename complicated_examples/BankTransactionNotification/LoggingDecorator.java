package complicated_examples.BankTransactionNotification;

public class LoggingDecorator extends NotifierDecorator {
    public LoggingDecorator(Notification notifier) {
        super(notifier);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Logging: Sending notification with message");
        super.sendNotification(message);
        System.out.println("Logging: Notification sent successfully");
    }
    
}
