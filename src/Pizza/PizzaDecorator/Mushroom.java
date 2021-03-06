package Pizza.PizzaDecorator;

import Pizza.Pizza;

public class Mushroom extends VegDecorator {
    Pizza pizza;

    public Mushroom(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return 50 + pizza.cost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Mushroom";
    }
}
