package builder.morecomputer;

public class OfficeComputer implements ComputerBuilder {
    private Computer computer;

    public OfficeComputer() {
        computer = new Computer();
    }

    @Override
    public void buildCPU() {
        computer.setCPU("Intel Core i3-4160");
    }

    @Override
    public void buildComputerCase() {
        computer.setComputerCase("Sama A34");
    }

    @Override
    public void buildMotherboard() {
        computer.setMotherboard("Gigabyte B85M - D3V");
    }

    @Override
    public void buildHDD() {
        computer.setHDD("250GB SATA 7200rpm");
    }

    @Override
    public void buildGPU() {
        computer.setGPU("None");
    }

    @Override
    public void buildPowerSupply() {
        computer.setPowerSupply(350);
    }

    @Override
    public void installOperatingSystem() {
        computer.setOperatingSystem("Windows 10");
    }

    @Override
    public void buildAmountOfRAM() {
        computer.setAmountOfRAM(8);
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
    
}
