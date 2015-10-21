/**
 * Created by USER on 21.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .setModel("Audi")
                .setPassengers(2)
                .setWheel(4)
                .build();

        Car car1 = new Car.Builder()
                .setModel("Porshe")
                .setWheel(2)
                .build();


        System.out.println(car);
        System.out.println(car1);
    }
}
