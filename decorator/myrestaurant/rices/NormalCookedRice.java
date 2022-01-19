package decorator.myrestaurant.rices;

// Cơm nấu như bình thường
public class NormalCookedRice extends Rice {

    public NormalCookedRice() {
        setDescription("Normal Cooked Rice");
    }

    @Override
    public double cost() {
        return 5;
    }
    
}
