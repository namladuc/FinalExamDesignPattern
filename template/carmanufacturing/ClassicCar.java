package template.carmanufacturing;

public class ClassicCar extends CarTemplate {

    public ClassicCar() {
        super();
    }

    @Override
    public void fixChassis() {
        System.out.println("Assembling chassis of the classical model");
        this.chassis = "Classic Chassis";
    }

    @Override
    public void fixBody() {
        System.out.println("Assembling body of the classical model");
        this.body = "Classic Body";
    }

    @Override
    public void paint() {
        System.out.println("Painting body of the classical model");
        this.paint = "Classic White Paint";
    }

    @Override
    public void fixInterior() {
        System.out.println("Setting up interior of the classical model");
        this.interior = "Classic interior";
    }
    
}
