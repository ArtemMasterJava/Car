import java.util.Arrays;

/**
 * Created by USER on 21.10.2015.
 */
abstract public class Car  {
    private String model;
    private String color;
    private Wheel[] wheels;

    public Car(String model, String color, int count, String type) {
        this.model = model;
        this.color = color;
        wheels= new Wheel[count];
        for (int i = 0; i < count ; i++) {
            wheels[i] = new Wheel(type);
        }
    }

    void move(){
        System.out.println("Go");
    }

    void stop(){
        System.out.println("Stop");
    }

    @Override
    public String toString() {
        return "Car {"+ model +", "+ color + ", " + Arrays.toString(wheels)+ " }";
    }
}
