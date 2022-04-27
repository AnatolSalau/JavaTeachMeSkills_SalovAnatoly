package HW_8_OOP.AdditionalTask_Clinic.doctors;

public class Therapist extends Doctor implements Cure{

    public Therapist() {
        super();
    }

    public Therapist(Condition condition) {
        super(condition);
    }

    @Override
    public void curePatient() {
        System.out.println("Dentist can cure your heart");
    }
}
