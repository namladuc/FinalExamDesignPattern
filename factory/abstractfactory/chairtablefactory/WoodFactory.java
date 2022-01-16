package factory.abstractfactory.chairtablefactory;

import factory.abstractfactory.chairtablefactory.products.*;

public class WoodFactory extends FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new WoodChair();
    }
 
    @Override
    public Table createTable() {
        return new WoodTable();
    }
}
