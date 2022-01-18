package builder.morecomputer;

public class Client {
    public static void main(String[] args) {
        ComputerBuilder builder1 = new GamingComputer();
        ComputerEngineer engineer = new ComputerEngineer(builder1);

        engineer.constructComputer();
        Computer myComputer = engineer.getComputer();

        System.out.println(myComputer);
    }
}
