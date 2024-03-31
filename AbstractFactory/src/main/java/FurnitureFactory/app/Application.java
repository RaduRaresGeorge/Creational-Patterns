package FurnitureFactory.app;

import FurnitureFactory.chair.Chair;
import FurnitureFactory.coffee_table.CoffeeTable;
import FurnitureFactory.factory.FurnitureFactory;
import FurnitureFactory.sofa.Sofa;

public class Application {
    private final Chair chair;
    private final Sofa sofa;
    private final CoffeeTable coffeeTable;

    public Application(FurnitureFactory factory) {
        chair = factory.createChair();
        sofa = factory.createSofa();
        coffeeTable = factory.createCoffeeTable();
    }

    public void paint() {
        chair.sitOn();
        sofa.lieOn();
        coffeeTable.putOn();
    }
}
