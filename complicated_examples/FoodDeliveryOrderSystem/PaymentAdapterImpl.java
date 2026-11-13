package complicated_examples.FoodDeliveryOrderSystem;

public class PaymentAdapterImpl implements AdapterInterface {
    private PaymentProcessorInterface paymentProcessor;

    public PaymentAdapterImpl(PaymentProcessorInterface paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    @Override
    public void processPayment(long amount) {
        // Convert the amount to rupees (assuming 1 unit = 1 rupee)
        paymentProcessor.pay(amount);
    }
    
}
