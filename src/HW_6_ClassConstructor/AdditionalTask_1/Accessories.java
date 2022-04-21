package HW_6_ClassConstructor.AdditionalTask_1;

public abstract class Accessories {
    private String name;
    private int volume;

    public Accessories() {
        this.name = null;
        this.volume = -1;
    }

    public Accessories(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
