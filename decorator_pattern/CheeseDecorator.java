package decorator_pattern;

public class CheeseDecorator extends BaseDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.5; // Adding cost of cheese
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }
    
}
