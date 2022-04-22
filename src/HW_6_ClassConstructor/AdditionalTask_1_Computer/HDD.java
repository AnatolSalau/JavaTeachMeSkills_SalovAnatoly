package HW_6_ClassConstructor.AdditionalTask_1_Computer;

public class HDD extends Accessories {
    private HDDType type;

    public HDD() {
        super();
        this.type = HDDType.INTERNAL;
    }

    public HDD(String name, int volume, HDDType type) {
        super(name,volume);
        this.type = type;
    }

    @Override
    public String toString() {
        String result ="name: " + super.getName() + ", " + "volume: "+ super.getVolume() +
                       ", " +"type: " + type;
        return result;
    }

    public HDDType getType() {
        return type;
    }

}
