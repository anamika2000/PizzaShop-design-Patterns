
public class PizzaOrder implements Command{
    Cook cook;
    String[] VegList, CheeseList, NonvegList;
    String order;
    public PizzaOrder(Cook cook, String order, String[] VegList, String[] CheeseList, String[] NonvegList){
        this.cook = cook;
        this.order = order;
        this.VegList = VegList;
        this.CheeseList = CheeseList;
        this.NonvegList = NonvegList;
    }

    @Override
    public void orderUp() {
        cook.pizzaType = order;
        cook.VegList = this.VegList;
        cook.CheeseList = this.CheeseList;
        cook.NonvegList = this.NonvegList;
        cook.getOrder("Pizza");
    }
}
