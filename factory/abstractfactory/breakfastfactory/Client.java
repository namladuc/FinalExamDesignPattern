package factory.abstractfactory.breakfastfactory;

import factory.abstractfactory.breakfastfactory.foodfactory.BreakFastFactory;
import factory.abstractfactory.breakfastfactory.foodfactory.PremiumBreakFast;
import factory.abstractfactory.breakfastfactory.foods.Bread;
import factory.abstractfactory.breakfastfactory.foods.StickyRice;

public class Client {
    public static void main(String[] args) {
        // Hello ! Welcome to my store
        // What product type you want ?
        // Premium 
        BreakFastFactory factory = new PremiumBreakFast();
        Bread breadPre = factory.createBread();
        breadPre.create();
        System.out.println();

        StickyRice stickyRice = factory.createStickyRice();
        stickyRice.create();
    }
}
