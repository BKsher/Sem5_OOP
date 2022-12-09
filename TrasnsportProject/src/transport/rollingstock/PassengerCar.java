package transport.rollingstock;

public class PassengerCar extends RollingStock {
    private int passengerCapacity;
    private int luggageCapacity;
    private int comfortLevel;

    public PassengerCar(int id, int weight, int maxCapacity, int passengerCapacity, int luggageCapacity, int comfortLevel) {
        super(id, weight, maxCapacity);
        this.passengerCapacity = passengerCapacity;
        this.luggageCapacity = luggageCapacity;
        this.comfortLevel = comfortLevel;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getLuggageCapacity() {
        return luggageCapacity;
    }

    public int getComfortLevel() {
        return comfortLevel;
    }

    @Override
    public String getType() {
        return "PassengerCar";
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "id=" + getId() +
                ", weight=" + getWeight() +
                ", maxCapacity=" + getMaxCapacity() +
                ", passengerCapacity=" + getPassengerCapacity() +
                ", luggageCapacity=" + getLuggageCapacity() +
                ", comfortLevel=" + getComfortLevel() +
                '}';
    }

}
