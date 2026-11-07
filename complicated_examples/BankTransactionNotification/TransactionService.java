package complicated_examples.BankTransactionNotification;

public class TransactionService {
    private Notification notification;

    public TransactionService(Notification notification) {
        this.notification = notification;
    }

    public void processTransaction(Transaction transaction) {
        // Process the transaction logic here
        System.out.println("Processing transaction: " + transaction.getDetails());
        
        // Send notification after processing
        notification.sendNotification("Transaction processed: " + transaction.getDetails());
    }
}
