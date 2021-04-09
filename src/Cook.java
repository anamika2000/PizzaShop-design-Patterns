import Beverage.Beverage;
import Pizza.Pizza;
import Pizza.PizzaDecorator.*;
import Pizza.PizzaDecorator.Olive;
import Pizza.PizzaDecorator.DoubleCheese;
import Pizza.PizzaDecorator.Mushroom;

// Receiver
public class Cook {
    public static String pizzaType="";
    public static String beverageType="";
    public static String[] VegList = null;
    public static String[] CheeseList = null;
    public static String[] NonvegList = null;
    Pizza pizza;
    Beverage beverage;
    public void getOrder(String factoryType){
        if(factoryType.equalsIgnoreCase("Pizza")){
            System.out.println(pizzaType + " order received.");

            PizzaFactory factory =  new PizzaFactory();
            pizza = factory.makePizza(pizzaType);

            pizza.prepareDough(pizzaType);
            pizza.cookDough(pizzaType);
            pizza.dishUp(pizzaType);
            pizza = decorate(VegList, CheeseList, NonvegList);

            System.out.println(pizza.getDescription() + " order completed.");
            System.out.println("Cost: " + pizza.cost());

        }
        else if(factoryType.equalsIgnoreCase("Beverage")){
            System.out.println(beverageType + " order received.");

            BeverageFactory factory = new BeverageFactory();
            beverage = factory.makeBeverage(beverageType);
            beverage.prepareBeverage();

            System.out.println(beverage.getDescription() + " order completed.");
            System.out.println("Cost: " + beverage.cost());
        }
        System.out.println("");
    }

    public Pizza decorate(String[] VegList, String[] CheeseList, String[] NonvegList){
        for (int i = 0; i < VegList.length; i++) {
            String Veg = VegList[i];
            if(Veg.equals("Olive")){
                pizza = new Olive(pizza);
            }
            else if(Veg.equals("Mushroom")){
                pizza = new Mushroom(pizza);
            }
          else if(Veg.equals("Onion")){
                pizza = new Onion(pizza);
        }
}

        for (int i = 0; i < CheeseList.length; i++) {
            String Cheese = CheeseList[i];
            if(Cheese.equals("DoubleCheese")){
                pizza = new DoubleCheese(pizza);
            }
           else if(Cheese.equals("DoubleCheese")){
                pizza = new DoubleCheese(pizza);
            }
          
        }

        for (int i = 0; i <NonvegList.length; i++) {
            String Nonveg = NonvegList[i];
            if(Nonveg.equals("Chickenchunks")){
                pizza = new Chickenchunks(pizza);
            }
            else if(Nonveg.equals("Pepperoni")){
                pizza = new Pepperoni(pizza);
            }
           
        }
        return pizza;
    }
}
