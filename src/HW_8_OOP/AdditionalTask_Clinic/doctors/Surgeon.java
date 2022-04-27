package HW_8_OOP.AdditionalTask_Clinic.doctors;

public class Surgeon extends Doctor implements Cure {

    public Surgeon() {
        super();
    }

    public Surgeon(Condition condition) {
        super(condition);
    }

    @Override
    public void curePatient() {
        System.out.println("Surgeon can cure your arm");
    }
}
