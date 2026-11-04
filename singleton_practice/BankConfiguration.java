package singleton_practice;

public class BankConfiguration {

    private final String bankName = "MyBank";
    private final String bankAddress = "123 Main St";
    private static BankConfiguration instance;

    private BankConfiguration() {
        // Private constructor to prevent instantiation
    }

    public static BankConfiguration getInstance() {
        if (instance == null) {
            instance = new BankConfiguration();
        }
        return instance;
    }

    public String getBankName() {
        return bankName;
    }
    
    public String getBankAddress() {
        return bankAddress;
    }
}
