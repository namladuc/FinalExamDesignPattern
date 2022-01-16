package factory.abstractfactory.breakfastfactory.foods;

public class BoxedStickyRice implements StickyRice {

    public BoxedStickyRice() {
        
    }

    @Override
    public int getPrice() {
        return 20;
    }

    @Override
    public String getToping() {
        return "HotDog or Fried fish ball";
    }

    @Override
    public void bake() {
        System.out.println("Sticky rice doesn't need to be reheated because it's still hot");
    }

    @Override
    public void create() {
        System.out.println("Boxed Sticky Rice is coming now");
        System.out.println("Your topping: " + getToping());
        System.out.println("Here is your Boxed Sticky Rice. Cost: " + getPrice());
        System.out.println("Enjoy your meal!");
    }
    
}
