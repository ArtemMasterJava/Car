/**
 * Created by USER on 22.10.2015.
 */
public class CarFactory {
    private String model;
    private int count;
    private class MyCar extends Car{

        public MyCar(String model, String color, int count, String type) {
            super(model, color, count, type);
        }
    }

    public CarFactory(String model, int countWheel) {
        this.model = model;
        this.count = countWheel;
    }

    public Car createCar(String color, String type){
        return new MyCar(model, color, count, type);
    }

}
