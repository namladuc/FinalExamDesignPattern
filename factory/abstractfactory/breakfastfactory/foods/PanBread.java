package factory.abstractfactory.breakfastfactory.foods;

public class PanBread implements Bread {

    public PanBread() {
        
    }

    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public String getToping() {
        return "Beef, Chicken, Egg Fried, Pate and Sauce";
    }

    @Override
    public void bake() {
        System.out.println("Pan bread is cooked on a cast iron pan and is still hot when served to client");
    }

    @Override
    public void create() {
        System.out.println("Pan Bread is coming wait several minutes");
        System.out.println("Your topping: " + getToping());
        System.out.println("Here is your Pan Bread. Cost: " + getPrice());
        System.out.println("Enjoy your meal!");
    }
    
}
