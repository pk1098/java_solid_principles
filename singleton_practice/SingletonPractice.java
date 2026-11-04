package singleton_practice;

public class SingletonPractice {
    public static void main(String[] args) {
        BankConfiguration config1 = BankConfiguration.getInstance();
        BankConfiguration config2 = BankConfiguration.getInstance();

        System.out.println("Bank Name: " + config1.getBankName());
        System.out.println("Bank Address: " + config1.getBankAddress());

        // Check if both instances are the same
        System.out.println("Are both instances the same? " + (config1 == config2));


        AppLogger logger1 = AppLogger.getInstance();
        AppLogger logger2 = AppLogger.getInstance();
        logger1.log("This is a test message.");
        logger2.log("This is another test message.");   
         System.out.println(
            "Same logger: " + (logger1 == logger2)
        );
    }
}
