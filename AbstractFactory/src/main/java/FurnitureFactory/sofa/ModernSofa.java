package FurnitureFactory.sofa;

public class ModernSofa implements Sofa{
    public boolean hasLegs() {
        return true;
    }

    public void lieOn() {
        System.out.println("Lying on a modern sofa.");
    }
}
