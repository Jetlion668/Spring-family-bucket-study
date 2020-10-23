package com.jetlion.factory;

import com.jetlion.entity.Car;

import java.util.HashMap;
import java.util.Map;

public class StaticCarFactory {

    private static Map<Integer, Car> cars;

    static {
        cars = new HashMap<Integer, Car>();
        cars.put(1, new Car(1, "奥迪"));
        cars.put(2, new Car(2, "奥拓"));
    }

    public static Car getCar(int id) {
        return cars.get(id);
    }

    public static Map<Integer, Car> getCars() {
        return cars;
    }

    public static void setCars(Map<Integer, Car> cars) {
        StaticCarFactory.cars = cars;
    }

}
