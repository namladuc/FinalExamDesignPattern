package factory.abstractfactory.breakfastfactory.foodfactory;

import factory.abstractfactory.breakfastfactory.foods.Bread;
import factory.abstractfactory.breakfastfactory.foods.PanBread;
import factory.abstractfactory.breakfastfactory.foods.PlateStickyRice;
import factory.abstractfactory.breakfastfactory.foods.StickyRice;

public class PremiumBreakFast implements BreakFastFactory {

    @Override
    public Bread createBread() {
        return new PanBread();
    }

    @Override
    public StickyRice createStickyRice() {
        return new PlateStickyRice();
    }
    
}