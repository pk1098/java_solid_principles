package decorator_pattern;

public class BasePizza implements Pizza {
    @Override
    public double getCost() {
        return 5.0; // Base cost of the pizza
    }

    @Override
    public String getDescription() {
        return "Base Pizza";
    }
    
}
