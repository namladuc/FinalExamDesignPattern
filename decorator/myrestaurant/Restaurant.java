package decorator.myrestaurant;

import decorator.myrestaurant.rices.NormalCookedRice;
import decorator.myrestaurant.rices.Rice;
import decorator.myrestaurant.toppings.EggFried;
import decorator.myrestaurant.toppings.StirFriedVegetable;

public class Restaurant {
    public static void main(String[] args) {
        Rice rice = new NormalCookedRice();
        Rice riceEgg = new EggFried(rice);
        Rice riceVegetable = new StirFriedVegetable(riceEgg);

        System.out.println(riceVegetable.getDescription()
            + " $" + riceVegetable.cost());
    }
}
