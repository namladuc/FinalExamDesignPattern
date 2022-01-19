package decorator.myrestaurant.rices;

// Cơm rang
public class FriedRice extends Rice {

    public FriedRice() {
        setDescription("Fried Rice");
    }

    @Override
    public double cost() {
        return 5;
    }
    
}
