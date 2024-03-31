package FurnitureFactory.chair;

public class VictorianChair implements Chair{
    public boolean hasLegs() {
        return true;
    }

    public void sitOn() {
        System.out.println("Sitting on a Victorian chair.");
    }
}
