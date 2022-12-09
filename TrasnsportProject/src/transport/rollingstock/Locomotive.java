package transport.rollingstock;

public class Locomotive extends RollingStock {
    private String model;
    private int power;

    public Locomotive(int id, int weight, int maxCapacity, String model, int power) {
        super(id, weight, maxCapacity);
        this.model = model;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String getType() {
        return "Locomotive";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Locomotive{id=").append(getId());
        sb.append(", weight=").append(getWeight());
        sb.append(", maxCapacity=").append(getMaxCapacity());
        sb.append(", model='").append(model).append('\'');
        sb.append(", power=").append(power);
        sb.append('}');
        return sb.toString();
    }

}
