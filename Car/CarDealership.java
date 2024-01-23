package Car;

import java.util.*;

public class CarDealership {
    ArrayList<Car> cars;

    public CarDealership()
    {
        cars = new ArrayList<>();
    }

    public Car getCar(int index)
    {
        return new Car(cars.get(index));
    }

    public void setCar(Car obj,int index)
    {
        cars.set(index,new Car(obj));
    }

    public void addCar(Car obj)
    {
        cars.add(new Car(obj));
    }
}
