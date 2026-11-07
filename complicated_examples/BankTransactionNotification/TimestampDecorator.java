package complicated_examples.BankTransactionNotification;

public class TimestampDecorator extends NotifierDecorator {
    public TimestampDecorator(Notification notifier) {
        super(notifier);
    }

    @Override
    public void sendNotification(String message) {
        String timestampedMessage = "[" + java.time.LocalDateTime.now() + "] " + message;
        super.sendNotification(timestampedMessage);
    }
    
}
