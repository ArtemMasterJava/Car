/**
 * Created by USER on 21.10.2015.
 */
public class Car {
    private String model;
    private int wheel;
    private int passengers;

    public String getModel() {
        return model;
    }

    public int getWheel() {
        return wheel;
    }

    public int getPassengers() {
        return passengers;
    }


    public Car(String model, int wheel, int passengers) {
        this.model = model;
        this.wheel = wheel;
        this.passengers = passengers;
    }

    public static class Builder{
        private String model;
        private int wheel;
        private int passengers;

        public Builder setModel(String model){
            this.model = model;
            return this;
        }
        public Builder setWheel(int wheel){
            this.wheel = wheel;
            return this;
        }
        public Builder setPassengers(int passengers){
            this.passengers = passengers;
            return this;
        }
        public Car build(){
            return new Car(model, wheel, passengers);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (wheel != car.wheel) return false;
        if (passengers != car.passengers) return false;
        return !(model != null ? !model.equals(car.model) : car.model != null);

    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + wheel;
        result = 31 * result + passengers;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("model='").append(model).append('\'');
        sb.append(", wheel=").append(wheel);
        sb.append(", passengers=").append(passengers);
        sb.append('}');
        return sb.toString();
    }
}
