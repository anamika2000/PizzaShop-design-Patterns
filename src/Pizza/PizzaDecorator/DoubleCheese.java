package Pizza.PizzaDecorator;

import Pizza.Pizza;

public class DoubleCheese extends CheeseDecorator {
    Pizza pizza;

    public DoubleCheese(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return 90 + pizza.cost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Double Cheese";
    }
}
