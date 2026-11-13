package complicated_examples.FoodDeliveryOrderSystem;

public class FoodFactory {
    public static FoodInterface getFood(String foodType) {
        if (foodType.equalsIgnoreCase("pizza")) {
            return new Pizza();
        }
        return null;
    }
}
