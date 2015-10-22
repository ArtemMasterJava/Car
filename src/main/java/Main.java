/**
 * Created by USER on 21.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory("Audi", 4);
        Car c1 = carFactory.createCar("red","winterType");
        System.out.println(c1);
    }
}
