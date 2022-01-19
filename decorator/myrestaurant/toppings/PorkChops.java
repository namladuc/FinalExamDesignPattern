package decorator.myrestaurant.toppings;

import decorator.myrestaurant.rices.Rice;

public class PorkChops extends ToppingDecorator {

    public PorkChops(Rice rice) {
        this.rice = rice;
    }

    @Override
    public String getDescription() {
        return rice.getDescription() + ", Pork Chops";
    }

    @Override
    public double cost() {
        return rice.cost() + 5;
    }
    
}
