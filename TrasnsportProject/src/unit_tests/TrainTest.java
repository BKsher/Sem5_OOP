package unit_tests;

import org.junit.Test;
import transport.rollingstock.Locomotive;
import transport.rollingstock.PassengerCar;
import transport.trains.Train;

import java.util.List;

import static org.junit.Assert.*;

// The TrainTest class is a unit test for the Train class
public class TrainTest {
    // This test verifies that the Train constructor properly initializes
    // the train's name and locomotive
    @Test
    public void testTrainConstructor() {
        Locomotive locomotive = new Locomotive(1, 1000, 2000, "model1", 500);
        Train train = new Train("train1", locomotive);
        assertEquals(train.getName(), "train1");
        assertEquals(train.getLocomotive(), locomotive);
    }

    // This test verifies that the addCar() method correctly adds a car
    // to the train's list of cars
    @Test
    public void testAddCar() {
        Locomotive locomotive = new Locomotive(1, 1000, 2000, "model1", 500);
        Train train = new Train("train1", locomotive);
        PassengerCar car1 = new PassengerCar(1, 1000, 40, 60, 1, 2);
        train.addCar(car1);
        assertEquals(train.getCars().get(0), car1);
    }

    // This test verifies that the removeCar() method correctly removes a car
    // from the train's list of cars
    @Test
    public void testRemoveCar() {
        Locomotive locomotive = new Locomotive(1, 1000, 2000, "model1", 500);
        Train train = new Train("train1", locomotive);
        PassengerCar car1 = new PassengerCar(1, 1000, 40, 60, 1, 2);
        train.addCar(car1);
        train.removeCar(car1);
        assertEquals(train.getCars().size(), 0);
    }

    // This test verifies that the sortCarsByComfortLevel() method correctly
    // sorts the train's list of cars by comfort level
    @Test
    public void testSortCarsByComfortLevel() {
        Locomotive locomotive = new Locomotive(1, 1000, 2000, "model1", 500);
        Train train = new Train("train1", locomotive);
        PassengerCar car1 = new PassengerCar(1, 1000, 40, 60, 1, 3);
        PassengerCar car2 = new PassengerCar(2, 1000, 50, 70, 1, 1);
        PassengerCar car3 = new PassengerCar(3, 1000, 30, 40, 1, 2);
        train.addCar(car1);
        train.addCar(car2);
        train.addCar(car3);
        train.sortCarsByComfortLevel();
        assertEquals(train.getCars().get(0), car1);
        assertEquals(train.getCars().get(1), car3);
        assertEquals(train.getCars().get(2), car2);
    }

    // This test verifies that the findCarsInPassengerCapacityRange() method correctly
    // finds cars in passenger capacity range of the train's list of cars
    @Test
    public void testFindCarsInPassengerCapacityRange() {
        Locomotive locomotive = new Locomotive(1, 1000, 2000, "model1", 500);
        Train train = new Train("train1", locomotive);
        PassengerCar car1 = new PassengerCar(1, 1000, 40, 60, 1, 2);
        PassengerCar car2 = new PassengerCar(2, 1000, 50, 70, 1, 2);
        PassengerCar car3 = new PassengerCar(3, 1000, 30, 40, 1, 2);
        train.addCar(car1);
        train.addCar(car2);
        train.addCar(car3);
        List<PassengerCar> foundCars = train.findCarsInPassengerCapacityRange(40, 60);
        assertEquals(foundCars.size(), 2);
        assertTrue(foundCars.contains(car1));
        assertTrue(foundCars.contains(car3));
    }
}
