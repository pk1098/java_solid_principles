package decorator_pattern;

public class MushroomDecorator extends BaseDecorator {
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.0; // Adding cost of mushroom
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Mushroom";
    }
}
