package builder.morecomputer;

// Director
public class ComputerEngineer {
    private ComputerBuilder computerBuilder;

    public ComputerEngineer(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void changeBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer getComputer() {
        return computerBuilder.getComputer();
    }

    public void constructComputer() {
        computerBuilder.buildCPU();
        computerBuilder.buildMotherboard();
        computerBuilder.buildHDD();
        computerBuilder.buildGPU();
        computerBuilder.buildPowerSupply();
        computerBuilder.buildComputerCase();
        computerBuilder.buildAmountOfRAM();
        computerBuilder.installOperatingSystem();
    }
}
