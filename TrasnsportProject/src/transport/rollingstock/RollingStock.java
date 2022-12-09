package transport.rollingstock;

public abstract class RollingStock {
    private int id;
    private int weight;
    private int maxCapacity;

    public RollingStock(int id, int weight, int maxCapacity) {
        this.id = id;
        this.weight = weight;
        this.maxCapacity = maxCapacity;
    }

    public int getId() {
        return id;
    }

    public int getWeight() {
        return weight;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public abstract String getType();
}
