package factory.abstractfactory.breakfastfactory.foodfactory;

import factory.abstractfactory.breakfastfactory.foods.*;

public interface BreakFastFactory {
    Bread createBread();
    StickyRice createStickyRice();
}
