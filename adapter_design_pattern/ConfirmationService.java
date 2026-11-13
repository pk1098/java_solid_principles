package adapter_design_pattern;

public class ConfirmationService {
    public void sendConfirmation(String productId) {
        // Simulate sending confirmation
        if (productId == null || productId.isEmpty()) {
            throw new IllegalArgumentException("Product ID cannot be null or empty");
        }
        System.out.println("Confirmation sent for product: " + productId);
    }
}
