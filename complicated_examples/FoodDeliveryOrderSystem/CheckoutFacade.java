package complicated_examples.FoodDeliveryOrderSystem;

public class CheckoutFacade {
    
    private final InventoryService inventorySystem;
    public CheckoutFacade(InventoryService inventorySystem) {
        this.inventorySystem = inventorySystem;
    }

    public void checkout(Order order, PaymentAdapterImpl paymentAdapter) {
        // Check inventory for each item in the order
        inventorySystem.checkStock(order.getFoodType(), order.getQuantity());
        FoodInterface foodItem = FoodFactory.getFood(order.getFoodType()); 
        if(order.hasExtraCheese()) {
            foodItem = new CheeseDecorator(foodItem);
        }
        if(order.hasExtraSauce()) {
            foodItem = new CheeseDecorator(foodItem);
        }
        long subtotal = Math.multiplyExact(
            foodItem.getPrice(), (long) order.getQuantity()
        );
        paymentAdapter.processPayment(subtotal);
    }
}
