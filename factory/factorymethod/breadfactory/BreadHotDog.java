package factory.factorymethod.breadfactory;

public class BreadHotDog extends Bread {

    public BreadHotDog() {
        
    }

    @Override
    public int getPrice() {
        return 25;
    }

    @Override
    public String getToping() {
        return "Hot dog, Cheese";
    }

    @Override
    public void bake() {
        System.out.println("Bread is bake 3 minutes 230 Cereus");
    }
    
}
