package complicated_examples.FoodDeliveryOrderSystem;

public abstract class FoodDecorator implements FoodInterface {
    protected FoodInterface food;

    public FoodDecorator(FoodInterface food) {
        this.food = food;
    }

    public abstract int getPrice();
}
