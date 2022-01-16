package factory.factorymethod.breadfactory;

public class FactoryBread {
    public static Bread payBread(String type) {
        if (type.toUpperCase().contains("EGG")) {
            return new BreadEggFried();
        } else if (type.toUpperCase().contains("HOTDOG")) {
            return new BreadHotDog();
        } else {
            return null;
        }
    }
}
