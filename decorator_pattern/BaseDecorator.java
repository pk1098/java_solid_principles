package decorator_pattern;

public abstract class BaseDecorator implements Pizza {
    Pizza pizza;

    public BaseDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract double getCost();
    public abstract String getDescription();
}
