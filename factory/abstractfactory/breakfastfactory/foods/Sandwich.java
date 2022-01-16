package factory.abstractfactory.breakfastfactory.foods;

public class Sandwich implements Bread {

    public Sandwich() {

    }

    @Override
    public int getPrice() {
        return 15;
    }

    @Override
    public String getToping() {
        return "Hotdog or Egg with Vegetable";
    }

    @Override
    public void bake() {
        System.out.println("No Bake!!");
    }

    @Override
    public void create() {
        System.out.println("Sandwich is coming wait several minutes");
        System.out.println("Your topping: " + getToping());
        System.out.println("Here is your Sandwich. Cost: " + getPrice());
        System.out.println("Enjoy your meal!");
    }
    
}
