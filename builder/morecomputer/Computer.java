package builder.morecomputer;

public class Computer implements ComputerPlan {
    private String computerCase;
    private String CPU;
    private String motherboard;
    private String GPU;
    private String HDD;
    private String operatingSystem;
    private int powerSupply;
    private int amountOfRAM;

    public Computer(String computerCase, String CPU, String motherboard, String GPU,
            String HDD, String operatingSystem, int powerSupply, int amountOfRAM) {
        this.computerCase = computerCase;
        this.CPU = CPU;
        this.motherboard = motherboard;
        this.GPU = GPU;
        this.HDD = HDD;
        this.operatingSystem = operatingSystem;
        this.powerSupply = powerSupply;
        this.amountOfRAM = amountOfRAM;
    }

    public Computer() {

    }

    @Override
    public void setCPU(String cPU) {
        CPU = cPU;
    }

    @Override
    public void setComputerCase(String computerCase) {
        this.computerCase = computerCase;
    }

    @Override
    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    @Override
    public void setGPU(String gPU) {
        GPU = gPU;
    }

    @Override
    public void setPowerSupply(int powerSupply) {
        this.powerSupply = powerSupply;
    }

    @Override
    public void setHDD(String hDD) {
        HDD = hDD;
    }

    @Override
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void setAmountOfRAM(int amountOfRAM) {
        this.amountOfRAM = amountOfRAM;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getComputerCase() {
        return computerCase;
    }

    public int getPowerSupply() {
        return powerSupply;
    }

    public String getHDD() {
        return HDD;
    }

    public String getCPU() {
        return CPU;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public String getGPU() {
        return GPU;
    }

    public int getAmountOfRAM() {
        return amountOfRAM;
    }

    public String toString() {
        return String.format(
            " CPU : %s \n Computer Case: %s \n Motherboard: %s \n GPU: %s \n HDD: %s \n OperatingSystem: %s \n powerSupply: %sW \n RAM: %sGB",
            CPU, computerCase, motherboard, GPU, HDD, operatingSystem, powerSupply, amountOfRAM);
    }

}