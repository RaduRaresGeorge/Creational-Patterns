package FurnitureFactory.sofa;

public class VictorianSofa implements Sofa{
    public boolean hasLegs() {
        return true;
    }

    public void lieOn() {
        System.out.println("Lying on a Victorian sofa.");
    }
}
