package FurnitureFactory;

import FurnitureFactory.app.Application;
import FurnitureFactory.factory.ModernFurnitureFactory;
import FurnitureFactory.factory.VictorianFurnitureFactory;

public class DemoFurniture {
    public static void main(String[] args) {
        Application app = new Application(new VictorianFurnitureFactory());
        System.out.println();
        app.paint();
        System.out.println();
        System.out.println();
        app = new Application(new ModernFurnitureFactory());
        System.out.println();
        app.paint();
    }
}
