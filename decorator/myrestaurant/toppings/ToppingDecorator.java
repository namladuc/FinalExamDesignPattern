package decorator.myrestaurant.toppings;

import decorator.myrestaurant.rices.Rice;

public abstract class ToppingDecorator extends Rice {
    Rice rice;

    public abstract String getDescription();
}
