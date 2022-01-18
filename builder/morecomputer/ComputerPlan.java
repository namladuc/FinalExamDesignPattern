package builder.morecomputer;

public interface ComputerPlan {
    void setCPU(String cPU);

    void setComputerCase(String computerCase);

    void setMotherboard(String motherboard);

    void setGPU(String gPU);

    void setPowerSupply(int powerSupply);

    void setHDD(String hDD);

    void setOperatingSystem(String operatingSystem);

    void setAmountOfRAM(int amountOfRAM);
}
