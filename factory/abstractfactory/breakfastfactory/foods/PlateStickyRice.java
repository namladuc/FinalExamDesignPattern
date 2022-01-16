package factory.abstractfactory.breakfastfactory.foods;

public class PlateStickyRice implements StickyRice {

    @Override
    public int getPrice() {
        return 60;
    }

    @Override
    public String getToping() {
        return "HotDog, Egg Fried, Grilled meat";
    }

    @Override
    public void bake() {
        System.out.println("The sticky rice is hot but still reheat in the oven for 2 minutes");
    }

    @Override
    public void create() {
        System.out.println("Plate Sticky Rice is coming now");
        System.out.println("Your topping: " + getToping());
        System.out.println("Here is your Plate Sticky Rice. Cost: " + getPrice());
        System.out.println("Enjoy your meal!");
    }
    
}
