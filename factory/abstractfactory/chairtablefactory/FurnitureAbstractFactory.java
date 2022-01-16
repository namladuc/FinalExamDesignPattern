package factory.abstractfactory.chairtablefactory;

import factory.abstractfactory.chairtablefactory.products.*;

public abstract class FurnitureAbstractFactory {
    public abstract Chair createChair();

    public abstract Table createTable();
}
