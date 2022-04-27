package CW_9_Static;

public class Tulpan extends Flower{
    private String name;

    public Tulpan(double cost, String name) {
        super(cost);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tulpan{" +
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
