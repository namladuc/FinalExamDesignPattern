package template.carmanufacturing;

public class Client {
    public static void main(String[] args) {
        CarTemplate car = new SportsCar();
        car.manufactureCar();
        if (car != null) {
            System.out.println("Below car delivered: ");
            System.out.println("======================================================================");
            System.out.println(car);
            System.out.println("======================================================================");
        }
    }
}
