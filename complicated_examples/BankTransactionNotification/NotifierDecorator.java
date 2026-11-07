package complicated_examples.BankTransactionNotification;

public abstract class NotifierDecorator implements Notification {
    protected Notification wrappedNotifier;

    public NotifierDecorator(Notification notifier) {
        this.wrappedNotifier = notifier;
    }

    @Override
    public void sendNotification(String message) {
        wrappedNotifier.sendNotification(message);
    }
    
}
