package Pizza.PizzaDecorator;

import Pizza.Pizza;

public class Chickenchunks extends NonvegDecorator {
    Pizza pizza;

    public Chickenchunks(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return 40 + pizza.cost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Chickenchunks";
    }
}
