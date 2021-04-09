package Pizza.PizzaDecorator;

import Pizza.Pizza;

public class Onion extends VegDecorator {
    Pizza pizza;

    public Onion(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return 30 + pizza.cost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Onion";
    }
}
