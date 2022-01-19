package decorator.myrestaurant.toppings;

import decorator.myrestaurant.rices.Rice;


// Rau xào
public class StirFriedVegetable extends ToppingDecorator {

    public StirFriedVegetable(Rice rice) {
        this.rice = rice;
    }

    @Override
    public String getDescription() {
        return rice.getDescription() + ", Stir Fried Vegetable";
    }

    @Override
    public double cost() {
        return rice.cost() + 2;
    }
    
}
