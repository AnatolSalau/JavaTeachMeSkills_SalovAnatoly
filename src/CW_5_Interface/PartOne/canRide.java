package CW_5_Interface.PartOne;

public interface canRide {
    boolean canRideOrNot(String weather);
    int maxSpeed(int limitation );
    default void printSpeed(int speed) {
        System.out.printf("Current speed = %d", speed);
    }


}
