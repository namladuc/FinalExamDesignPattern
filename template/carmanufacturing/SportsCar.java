package template.carmanufacturing;

public class SportsCar extends CarTemplate {

    public SportsCar() {
        super();
    }

    @Override
    public void fixChassis() {
        System.out.println("Assembling chassis of the sports model");
        this.chassis = "Sporty Chassis";
    }

    @Override
    public void fixBody() {
        System.out.println("Assembling body of the sports model");
        this.body = "Sporty Body";
    }

    @Override
    public void paint() {
        System.out.println("Painting body of the sports model");
        this.paint = "Sporty Torch Red Paint";
    }

    @Override
    public void fixInterior() {
        System.out.println("Setting up interior of the sports model");
        this.interior = "Sporty interior";
    }
}
