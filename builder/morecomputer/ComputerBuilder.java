package builder.morecomputer;

// Builder
public interface ComputerBuilder {
    void buildCPU();
 
    void buildComputerCase();
 
    void buildMotherboard();
 
    void buildHDD();

    void buildGPU();

    void buildPowerSupply();

    void installOperatingSystem();

    void buildAmountOfRAM();

    Computer getComputer();
}
