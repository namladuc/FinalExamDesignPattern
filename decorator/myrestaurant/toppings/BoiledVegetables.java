package decorator.myrestaurant.toppings;

import decorator.myrestaurant.rices.Rice;

// Rau luộc
public class BoiledVegetables extends ToppingDecorator {

    public BoiledVegetables(Rice rice) {
        this.rice = rice;
    }

    @Override
    public String getDescription() {
        return rice.getDescription() + ", Boiled Vegetables";
    }

    @Override
    public double cost() {
        return rice.cost() + 2;
    }

}
