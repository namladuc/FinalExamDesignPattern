package factory.abstractfactory.breakfastfactory.foodfactory;

import factory.abstractfactory.breakfastfactory.foods.*;

public class NormalBreakFast implements BreakFastFactory {

    @Override
    public Bread createBread() {
        return new Sandwich();
    }

    @Override
    public StickyRice createStickyRice() {
        return new BoxedStickyRice();
    }
    
}
