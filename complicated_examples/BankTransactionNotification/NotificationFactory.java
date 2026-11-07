package complicated_examples.BankTransactionNotification;

public class NotificationFactory {
    
    public static Notification createNotification(String notificationType) {
        switch (notificationType) {
            case "EMAIL":
                return new EmailNotifier();
            default:
                throw new IllegalArgumentException("Invalid notification type");
        }
    }

}
