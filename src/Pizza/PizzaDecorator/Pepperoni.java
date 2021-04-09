package Pizza.PizzaDecorator;

import Pizza.Pizza;

public class Pepperoni extends NonvegDecorator {
    Pizza pizza;

    public Pepperoni(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return 60 + pizza.cost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Pepperoni";
    }
}
