package collection.collect;

import java.util.Objects;

public class Car {
    private String make;
    private String model;
    private int mileAge;

    public Car(String make, String model, int mileAge) {
        super();
        this.make = make;
        this.model = model;
        this.mileAge = mileAge;
    }

    @Override
    public boolean equals(Object o) {
        Car c = (Car) o;
        System.out.format("Comparing %s %s with %s %s %n", this.make, this.model, c.make,c.model);
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(getMake(), car.getMake()) && Objects.equals(getModel(), car.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMake(), getModel());
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileAge() {
        return mileAge;
    }

    public void setMileAge(int mileAge) {
        this.mileAge = mileAge;
    }
}
