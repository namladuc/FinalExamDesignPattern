package factory.factorymethod.breadfactory;

public abstract class Bread {

    public abstract int getPrice();
    public abstract String getToping();
    public abstract void bake();

    @Override
    public String toString() {
        this.bake();
        return String.format("%s, price = %s, toping = %s", 
            this.getClass().getName().split("\\.")[this.getClass().getName().split("\\.").length - 1], 
            this.getPrice(), this.getToping());
    }

}