package complicated_examples.FoodDeliveryOrderSystem;

public class Pizza implements FoodInterface {

    @Override 
    public void getDescription() {
        System.out.println("Pizza: A base pizza");
    }

    @Override
    public int getPrice() {
        return 20;
    }
    
}
