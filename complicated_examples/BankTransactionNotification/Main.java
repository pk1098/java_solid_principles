package complicated_examples.BankTransactionNotification;

public class Main {
    public static void main(String[] args) {
        Transaction transaction = new Transaction.Builder()
        .setTransactionId("TXN12345", 1000.0)
        .setReceipent("Priya")
        .setDescription("Rent payment")
        .build();

        Notification notifier = new LoggingDecorator(
            new TimestampDecorator(
                NotificationFactory.createNotification("email")
            )
        );

        TransactionService service = new TransactionService(notifier);
        service.processTransaction(transaction);
    }
}
