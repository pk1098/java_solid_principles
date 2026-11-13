package adapter_design_pattern;

public class InventoryService {
    public boolean isInStock(String productId) {
        // Simulate checking inventory
        if (productId == null || productId.isEmpty()) {
            throw new IllegalArgumentException("Product ID cannot be null or empty");
        }
        if (!productId.equals("BOOK-101")) {
            return false; // Simulate that only "BOOK-101" is in stock
        }
        return true; 
    }
}
