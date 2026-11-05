package factory_abstract_factory;

public class BankAccountFactory {
    public static BankAccount createBankAccount(String accountType) {
        switch (accountType.toLowerCase()) {
            case "savings":
                return new SavingsAccount();
            default:
                throw new IllegalArgumentException("Unknown account type: " + accountType);
        }
    }
}
