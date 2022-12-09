package com.company;

import transport.rollingstock.Locomotive;
import transport.trains.Train;
import transport.rollingstock.PassengerCar;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Locomotive locomotive = new Locomotive(1, 100, 10, "Model A", 200);

        // Создаем пассажирский поезд с заданными параметрами
        Train train = new Train("Express", locomotive);

        // Создаем несколько вагонов для поезда
        PassengerCar passengerCar1 = new PassengerCar(1, 100, 50, 50, 3, 3);
        PassengerCar passengerCar2 = new PassengerCar(2, 150, 60, 70, 2, 2);
        PassengerCar passengerCar3 = new PassengerCar(3, 120, 70, 40, 1, 1);
        PassengerCar passengerCar4 = new PassengerCar(4, 110, 80, 30, 4, 4);


        // Добавляем вагоны в поезд
        train.addCar(passengerCar1);
        train.addCar(passengerCar2);
        train.addCar(passengerCar3);
        train.addCar(passengerCar4);

        // Выводим информацию о поезде на консоль
        System.out.println(train);

        // Сортируем вагоны поезда по уровню комфортности
        train.sortCarsByComfortLevel();
        System.out.println(train);

        // Выводи общее количество пассажиров
        System.out.println("Total amount of passengers" + train.getTotalPassengerCapacity());

        // Выводи общее количество багажа
        System.out.println("Total amount of luggage" + train.getTotalLuggageCapacity());

        // Ищем вагоны с заданным диапазоном пассажирской вместимости
        List<PassengerCar> foundCars = train.findCarsInPassengerCapacityRange(40, 60);
        System.out.println("All cars with capacity between 40 and 60");
        for (PassengerCar car : foundCars) {
            System.out.println(car);
        }
    }
}

