package HW_8_OOP.AdditionalTask_Clinic.doctors;

public abstract class Doctor implements Cure{
    public Condition condition;

    public Doctor() {
        this.condition = Condition.BUSY;
    }

    public Doctor(Condition condition) {
        this.condition = condition;
    }

    public void printCondition() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "\nDoctor{" +
                "condition=" + condition +
                "}\n";
    }
}
