package adapter_design_pattern;

public class LegacyPaymentAdapter implements PaymentProcessor {
    private final LegacyPaymentGateway legacyPaymentGateway;

    public LegacyPaymentAdapter(LegacyPaymentGateway legacyPaymentGateway) {
        this.legacyPaymentGateway = legacyPaymentGateway;
    }

    @Override
    public void pay(int amountInRupees) {
        if(amountInRupees < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        long amountInPaise = amountInRupees * 100L;
        legacyPaymentGateway.makePaymentInPaise(amountInPaise);
    }
    
}
