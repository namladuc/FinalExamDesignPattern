package state.toasters;

public abstract class ToasterState {
    public ToasterState insertBread() {
        throw new Error("Invalid operation");
    }

    public ToasterState pullLever() {
        throw new Error("Invalid operation");
    }

    public ToasterState ejectBread() {
        throw new Error("Invalid operation");
    }

    public ToasterState removeBread() {
        throw new Error("Invalid operation");
    }
}
