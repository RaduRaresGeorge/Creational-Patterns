package FurnitureFactory.factory;

import FurnitureFactory.chair.Chair;
import FurnitureFactory.chair.VictorianChair;
import FurnitureFactory.coffee_table.CoffeeTable;
import FurnitureFactory.coffee_table.VictorianCoffeeTable;
import FurnitureFactory.sofa.Sofa;
import FurnitureFactory.sofa.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory{

    public Chair createChair() {
        System.out.println("Creating a Victorian chair.");
        return new VictorianChair();
    }

    public Sofa createSofa() {
        System.out.println("Creating a Victorian sofa.");
        return new VictorianSofa();
    }

    public CoffeeTable createCoffeeTable() {
        System.out.println("Creating a Victorian coffee table.");
        return new VictorianCoffeeTable();
    }
}
