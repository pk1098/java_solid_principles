package decorator_pattern;

public class main {
    public static void main(String[] args) {
        Pizza basePizza = new BasePizza();
        System.out.println("Cost: " + basePizza.getCost());
        System.out.println("Description: " + basePizza.getDescription());

        Pizza cheesePizza = new CheeseDecorator(basePizza);
        System.out.println("Cost: " + cheesePizza.getCost());
        System.out.println("Description: " + cheesePizza.getDescription());

    }
}
