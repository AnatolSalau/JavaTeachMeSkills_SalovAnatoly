package CW_9_Static;

public class Rose extends Flower{
    private String name;

    public Rose(double cost, String name) {
        super(cost);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "country='" + country + '\'' +
                ", lengthOfHold=" + lengthOfHold +
                ", cost=" + cost +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
