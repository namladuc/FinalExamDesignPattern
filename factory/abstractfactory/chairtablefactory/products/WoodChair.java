package factory.abstractfactory.chairtablefactory.products;

public class WoodChair implements Chair {
    @Override
    public void create() {
        System.out.println("Create wood chair");
    }
}
