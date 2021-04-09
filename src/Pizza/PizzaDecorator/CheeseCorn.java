package Pizza.PizzaDecorator;

import Pizza.Pizza;

public class CheeseCorn extends CheeseDecorator {
    Pizza pizza;

    public CheeseCorn(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return 40 + pizza.cost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", CheeseCorn";
    }
}
