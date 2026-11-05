package factory_abstract_factory;

public class SavingsAccount implements BankAccount {
    @Override
    public void deposit(double amount) {
        System.out.println("Depositing " + amount + " into Savings Account");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawing " + amount + " from Savings Account");
    }
}
