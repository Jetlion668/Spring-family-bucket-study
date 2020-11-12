package com.jetlion.factory;

import com.jetlion.entity.Car;

import java.util.HashMap;
import java.util.Map;

public class InstanceCarFactory {

    private Map<Integer, Car> cars;
    public InstanceCarFactory() {
        cars = new HashMap<Integer,Car>();
        cars.put(1, new Car(1,"奥迪"));
        cars.put(2, new Car(2,"奥拓"));
    }
    public Car getCar(int num){
        return cars.get(num);
    }

    public Map<Integer, Car> getCars() {
        return cars;
    }

    public void setCars(Map<Integer, Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "InstanceCarFactory{" +
                "cars=" + cars +
                '}';
    }
}
