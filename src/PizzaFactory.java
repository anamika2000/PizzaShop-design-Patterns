import Pizza.*;

public class PizzaFactory {

    public Pizza makePizza(String pizzaType) {
        if (pizzaType.equals(null)){
            return null;
        }
        else if(pizzaType.equals("Regular Pizza")){
            return new RegularPizza();
        }
        else if(pizzaType.equals("Thincrust Pizza")){
            return new ThincrustPizza();
        }
        return null;
    }

}
