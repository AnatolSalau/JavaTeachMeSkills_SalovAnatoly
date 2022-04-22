package HW_6_ClassConstructor.AdditionalTask_1_Computer;

public class RAM extends Accessories{


    public RAM() {
        super();
    }

    public RAM(String name, int volume) {
        super(name,volume);
    }

    @Override
    public String toString() {
        String result ="name: " + super.getName() +", " +
                       "volume: "+ super.getVolume() + "\n";
        return result;
    }


}
