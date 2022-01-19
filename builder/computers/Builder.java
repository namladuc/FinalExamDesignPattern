package builder.computers;

public interface Builder {
    Builder withCase(String computerCase);
    Builder withCPU(String CPU);
    Builder withMotherboard(String motherboard);
    Builder withGPU(String GPU);
    Builder withHDD(String HDD);
    Builder withOperatingSystem(String operatingSystem);
    Builder withPowerSupply(int powerSupply);
    Builder withAmountOfRam(int amountOfRAM);
    Computer build();
}
