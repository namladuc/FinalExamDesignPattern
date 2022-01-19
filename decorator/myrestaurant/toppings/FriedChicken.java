package decorator.myrestaurant.toppings;

import decorator.myrestaurant.rices.Rice;

public class FriedChicken extends ToppingDecorator {

    public FriedChicken(Rice rice) {
        this.rice = rice;
    }

    @Override
    public String getDescription() {
        return rice.cost() + ", Fried Chicken";
    }

    @Override
    public double cost() {
        return rice.cost() + 5;
    }
    
}
