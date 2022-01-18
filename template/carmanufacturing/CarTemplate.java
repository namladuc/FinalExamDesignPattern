package template.carmanufacturing;

public abstract class CarTemplate {
    protected String chassis;
    protected String body;
    protected String paint;
    protected String interior;

    public CarTemplate() {

        super();

    }

    // steps
    public abstract void fixChassis();

    public abstract void fixBody();

    public abstract void paint();

    public abstract void fixInterior();

    // template method
    public void manufactureCar() {
        fixChassis();
        fixBody();
        paint();
        fixInterior();
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getPaint() {
        return paint;
    }

    public void setPaint(String paint) {
        this.paint = paint;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public String toString() {
        // StringBuilder class also uses Builder Design Pattern with implementation of
        // java.lang.Appendable interface
        StringBuilder builder = new StringBuilder();
        builder.append("Car [chassis=").append(chassis).append(", body=").append(body).append(", paint=").append(paint)
                .append(", interior=").append(interior).append("]");
        return builder.toString();
    }
}
