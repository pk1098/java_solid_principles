package complicated_examples.BankTransactionNotification;

public class EmailNotifier implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email Notification: " + message);
    }
    
}
