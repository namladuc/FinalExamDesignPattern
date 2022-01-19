package decorator.myrestaurant.rices;

public abstract class Rice {
    private String description = "Cooked rice ";

    public String getDescription() {
        return description;
    }

    protected void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();
}