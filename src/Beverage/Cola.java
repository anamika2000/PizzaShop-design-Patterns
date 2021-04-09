package Beverage;

public class Cola extends ColdBeverage{
    @Override
    public double cost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "Cocacola";
    }
}
