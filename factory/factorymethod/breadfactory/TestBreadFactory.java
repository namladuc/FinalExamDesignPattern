package factory.factorymethod.breadfactory;

import java.util.Scanner;

public class TestBreadFactory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your bread type (Egg or HotDog): ");
        String type = sc.nextLine();
        System.out.println(FactoryBread.payBread(type));
        sc.close();
    }
}
