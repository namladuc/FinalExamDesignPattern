package builder.computers;

public class ComputerBuilder {
    private String computerCase;
    private String CPU;
    private String motherboard;
    private String GPU;
    private String HDD;
    private String operatingSystem;
    private int powerSupply;
    private int amountOfRAM;

    public ComputerBuilder withCase(String computerCase) {
        this.computerCase = computerCase;
        return this;
    }

    public ComputerBuilder withCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    public ComputerBuilder withMotherboard(String motherboard) {
        this.motherboard = motherboard;
        return this;
    }

    public ComputerBuilder withGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }

    public ComputerBuilder withHDD(String HDD) {
        this.HDD = HDD;
        return this;
    }

    public ComputerBuilder withOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    public ComputerBuilder withPowerSupply(int powerSupply) {
        this.powerSupply = powerSupply;
        return this;
    }

    public ComputerBuilder withAmountOfRam(int amountOfRAM) {
        this.amountOfRAM = amountOfRAM;
        return this;
    }

    public Computer build() {
        Computer computer = new Computer(computerCase, CPU, motherboard, GPU, HDD, operatingSystem, powerSupply,
                amountOfRAM);
        return computer;
    }
}
