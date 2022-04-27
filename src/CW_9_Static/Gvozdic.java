package CW_9_Static;

public class Gvozdic extends Flower{
    private String name;

    public Gvozdic() {
    }

    public Gvozdic(double cost, String name) {
        super(cost);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Gvozdic{" +
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
