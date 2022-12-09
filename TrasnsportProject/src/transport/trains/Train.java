package transport.trains;

import transport.rollingstock.PassengerCar;
import transport.rollingstock.Locomotive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Train {
    private String name;
    private Locomotive locomotive;
    private List<PassengerCar> cars;

    public Train(String name, Locomotive locomotive) {
        this.name = name;
        this.locomotive = locomotive;
        this.cars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Locomotive getLocomotive() {
        return locomotive;
    }

    public List<PassengerCar> getCars() {
        return cars;
    }

    public void addCar(PassengerCar car) {
        cars.add(car);
    }

    public void removeCar(PassengerCar car) {
        cars.remove(car);
    }

    public int getTotalPassengerCapacity() {
        int total = 0;
        for (PassengerCar car : cars) {
            total += car.getPassengerCapacity();
        }
        return total;
    }

    public int getTotalLuggageCapacity() {
        int total = 0;
        for (PassengerCar car : cars) {
            total += car.getLuggageCapacity();
        }
        return total;
    }

    public void sortCarsByComfortLevel() {
        Collections.sort(cars, (car1, car2) -> car2.getComfortLevel() - car1.getComfortLevel());
    }

    public List<PassengerCar> findCarsInPassengerCapacityRange(int min, int max) {
        List<PassengerCar> result = new ArrayList<>();
        for (PassengerCar car : cars) {
            if (car.getPassengerCapacity() >= min && car.getPassengerCapacity() <= max) {
                result.add(car);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Train{name='").append(name).append('\'');
        sb.append(", locomotive=").append(locomotive);
        sb.append(", cars=[");
        for (PassengerCar car : cars) {
            sb.append('\n');
            sb.append(car);
        }
        sb.append("\n]}");
        return sb.toString();
    }

}
