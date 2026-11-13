package adapter_design_pattern;

public class Main {
    public static void main(String[] args) {
        // Create instances of the services
        LegacyPaymentGateway legacyPaymentGateway = new LegacyPaymentGateway();
        PaymentProcessor paymentProcessor = new LegacyPaymentAdapter(legacyPaymentGateway);
        CheckoutFacade checkoutFacade = new CheckoutFacade(paymentProcessor);

        // Simulate a purchase process
        String productId = "BOOK-101";
        int amountInRupees = 500;

        try {
            checkoutFacade.checkout(productId, amountInRupees);
        } catch (IllegalStateException e) {
            System.out.println("Checkout failed: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}
 