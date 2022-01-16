package factory.abstractfactory.breakfastfactory.foods;

public class Sandwich implements Bread {

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public String getToping() {
        return null;
    }

    @Override
    public void bake() {
        
    }

    @Override
    public void create() {
        
    }
    
}
