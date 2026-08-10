
class PizzaBuilder {
    private StringBuilder toppings = new StringBuilder();

    public PizzaBuilder addToppings(String topping) {
        toppings.append(topping).append(", ");
        return this;
    }

    public String print() {
        return "Pizza with: " + toppings;
    }
}

public class MethodChaining {
    public static void main(String[] args) {
        String pizzaToppings = new PizzaBuilder()
                .addToppings("Grilled Cheese")
                .addToppings("Tomatoes")
                .print();
        System.out.println(pizzaToppings);
    }
}
