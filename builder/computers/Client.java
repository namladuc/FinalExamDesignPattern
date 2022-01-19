package builder.computers;

public class Client {
    public static void main(String[] args) {
        Computer computer = new ComputerBuilder()
                .withCase("Tower")
                .withCPU("Intel i5")
                .withMotherboard("MSI B360M-MORTAR")
                .withGPU("nVidia Geforce GTX 750ti")
                .withHDD("Toshiba 1TB")
                .withOperatingSystem("Windows 10")
                .withPowerSupply(500)
                .withAmountOfRam(8)
                .build();

        System.out.println(computer);
    }

}
