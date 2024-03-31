package FurnitureFactory.factory;

import FurnitureFactory.chair.Chair;
import FurnitureFactory.coffee_table.CoffeeTable;
import FurnitureFactory.sofa.Sofa;

public interface FurnitureFactory {

    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}
