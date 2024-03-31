package FurnitureFactory.chair;

public class ModernChair implements Chair{
    public boolean hasLegs() {
        return true;
    }

    public void sitOn() {
        System.out.println("Sitting on a modern chair.");
    }
}
