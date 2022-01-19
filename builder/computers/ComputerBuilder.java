package builder.computers;

public class ComputerBuilder implements Builder {
    private String computerCase;
    private String CPU;
    private String motherboard;
    private String GPU;
    private String HDD;
    private String operatingSystem;
    private int powerSupply;
    private int amountOfRAM;

    @Override
    public Builder withCase(String computerCase) {
        this.computerCase = computerCase;
        return this;
    }

    @Override
    public Builder withCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    @Override
    public Builder withMotherboard(String motherboard) {
        this.motherboard = motherboard;
        return this;
    }

    @Override
    public Builder withGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }

    @Override
    public Builder withHDD(String HDD) {
        this.HDD = HDD;
        return this;
    }

    @Override
    public Builder withOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    @Override
    public Builder withPowerSupply(int powerSupply) {
        this.powerSupply = powerSupply;
        return this;
    }

    @Override
    public Builder withAmountOfRam(int amountOfRAM) {
        this.amountOfRAM = amountOfRAM;
        return this;
    }

    @Override
    public Computer build() {
        Computer computer = new Computer(computerCase, CPU, motherboard, GPU, HDD, operatingSystem, powerSupply,
                amountOfRAM);
        return computer;
    }
}
