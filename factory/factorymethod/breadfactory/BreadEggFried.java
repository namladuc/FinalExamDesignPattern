package factory.factorymethod.breadfactory;

public class BreadEggFried extends Bread {

    public BreadEggFried() {

    }

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public String getToping() {
        return "Egg, Vegetable";
    }

    @Override
    public void bake() {
        System.out.println("Bread is bake 1 minutes 200 Cereus");
    }
    
}
