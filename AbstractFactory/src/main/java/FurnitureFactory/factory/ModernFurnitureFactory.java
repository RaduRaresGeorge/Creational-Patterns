package FurnitureFactory.factory;

import FurnitureFactory.chair.Chair;
import FurnitureFactory.chair.ModernChair;
import FurnitureFactory.coffee_table.CoffeeTable;
import FurnitureFactory.coffee_table.ModernCoffeeTable;
import FurnitureFactory.sofa.ModernSofa;
import FurnitureFactory.sofa.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory{

        public Chair createChair() {
            System.out.println("Creating a modern chair.");
            return new ModernChair();
        }

        public Sofa createSofa() {
            System.out.println("Creating a modern sofa.");
            return new ModernSofa();
        }

        public CoffeeTable createCoffeeTable() {
            System.out.println("Creating a modern coffee table.");
            return new ModernCoffeeTable();
        }
}
