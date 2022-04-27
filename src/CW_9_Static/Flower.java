package CW_9_Static;

public abstract class Flower {
    protected String country;
    protected int lengthOfHold;
    protected double cost;

    protected static int count;

    {
        country = "Belarus";
        lengthOfHold = 1;
        cost = 5;
    }

    static {
        count = 0;
    }

    public Flower() {
    }

    public Flower(double cost) {
        this.cost = cost;
        count++;
    }

    public static int printCount() {
        System.out.printf("Quantity flowers = %d",count);
        return count;
    }


}
