package complicated_examples.FoodDeliveryOrderSystem;

import java.util.HashMap;
import java.util.Map;

public class InventoryService {
    private final Map<String, Integer> stock = new HashMap<>(
        Map.of("pizza", 5, "burger", 5, "sandwich", 5)
    );

    public void checkStock(String foodType, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive");
        }

        Integer available = stock.get(foodType);

        if (available == null) {
            throw new IllegalArgumentException("Unknown food: " + foodType);
        }

        if (quantity > available) {
            throw new IllegalStateException("Insufficient stock");
        }
    }

    public void reduceStock(String foodType, int quantity) {
        checkStock(foodType, quantity);
        stock.put(foodType, stock.get(foodType) - quantity);
    }
}
