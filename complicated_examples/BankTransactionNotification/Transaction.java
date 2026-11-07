package complicated_examples.BankTransactionNotification;

public class Transaction {
    private String transactionId;
    private double amount;
    private String receipent;
    private String description;

    private Transaction(){}

    public String getDetails() {
        return "Transaction ID: " + transactionId + ", Amount: " + amount + ", Receipent: " + receipent + ", Description: " + description;
    }

    public static class Builder{
        
        private String transactionId;
        private double amount;
        private String receipent;
        private String description;

        public Builder setTransactionId(String transactionId, double amount) {
            this.transactionId = transactionId;
            this.amount = amount;
            return this;
        }

        public Builder setAmount(double amount) {
            this.amount = amount;
            return this;
        }

        public Builder setReceipent(String receipent) {
            this.receipent = receipent;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Transaction build() {
            Transaction transaction = new Transaction();
            transaction.transactionId = this.transactionId;
            transaction.amount = this.amount;
            transaction.receipent = this.receipent;
            transaction.description = this.description;
            return transaction;
        }
    }
}
