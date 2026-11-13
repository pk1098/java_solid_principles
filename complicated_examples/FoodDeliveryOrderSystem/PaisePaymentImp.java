package complicated_examples.FoodDeliveryOrderSystem;

public class PaisePaymentImp implements PaymentProcessorInterface {
    @Override
    public void pay(long amount) {
        System.out.println("Paid " + amount + " paise using PaisePaymentImp.");
    }
    
}
