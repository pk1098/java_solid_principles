package complicated_examples.FoodDeliveryOrderSystem;

public class CheeseDecorator extends FoodDecorator {

    public CheeseDecorator(FoodInterface food) {
        super(food);
    }

    @Override
    public int getPrice() {
        return food.getPrice() + 5; // Adding cheese costs an additional 5
    }

    @Override
    public void getDescription() {
        food.getDescription();
        System.out.println(" + Cheese");
    }
    
}
