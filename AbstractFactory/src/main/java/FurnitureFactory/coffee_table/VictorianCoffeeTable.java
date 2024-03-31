package FurnitureFactory.coffee_table;

public class VictorianCoffeeTable implements CoffeeTable {

        @Override
        public boolean hasLegs() {
            return true;
        }

        @Override
        public void putOn() {
            System.out.println("Putting on a Victorian coffee table");
        }
}
