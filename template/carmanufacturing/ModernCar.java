package template.carmanufacturing;

public class ModernCar extends CarTemplate {

    public ModernCar() {
        super();
    }

    @Override
    public void fixChassis() {
        System.out.println("Assembling chassis of the modern model");
        this.chassis = "Modern Chassis";
    }

    @Override
    public void fixBody() {
        System.out.println("Assembling body of the modern model");
        this.body = "Modern Body";
    }

    @Override
    public void paint() {
        System.out.println("Painting body of the modern model");
        this.paint = "Modern Black Paint";
    }

    @Override
    public void fixInterior() {
        System.out.println("Setting up interior of the modern model");
        this.interior = "Modern interior";
    }
}
