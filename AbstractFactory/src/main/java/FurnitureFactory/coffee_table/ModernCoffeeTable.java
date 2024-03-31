package FurnitureFactory.coffee_table;

public class ModernCoffeeTable implements CoffeeTable{

    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void putOn() {
        System.out.println("Putting on a modern coffee table");
    }
}
