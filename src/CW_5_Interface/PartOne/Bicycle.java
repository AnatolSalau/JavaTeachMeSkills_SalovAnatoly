package CW_5_Interface.PartOne;

public class Bicycle implements canRide, canShine {

    @Override
    public boolean canRideOrNot(String weather) {
        return false;
    }

    @Override
    public int maxSpeed(int limitation) {
        return 0;
    }

    @Override
    public boolean isShineOrNOt(String time) {
        return false;
    }
}
