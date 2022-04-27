package HW_8_OOP.AdditionalTask_Clinic.doctors;

public class Dentist extends Doctor implements Cure{

    public Dentist() {
        super();
    }

    public Dentist(Condition condition) {
        super(condition);
    }

    @Override
    public void curePatient() {
        System.out.println("Dentist can cure your tooth");
    }
}
