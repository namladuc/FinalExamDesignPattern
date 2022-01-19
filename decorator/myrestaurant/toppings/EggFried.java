package decorator.myrestaurant.toppings;

import decorator.myrestaurant.rices.Rice;

public class EggFried extends ToppingDecorator {

    public EggFried(Rice rice) {
        this.rice = rice;
    }

    @Override
    public String getDescription() {
        return rice.getDescription() + ", Egg Fried";
    }

    @Override
    public double cost() {
        return rice.cost() + 3;
    }
    
}
