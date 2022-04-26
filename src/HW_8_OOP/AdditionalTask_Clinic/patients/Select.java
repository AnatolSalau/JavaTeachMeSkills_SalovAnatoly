package HW_8_OOP.AdditionalTask_Clinic.patients;

import HW_8_OOP.AdditionalTask_Clinic.doctors.Cure;
import HW_8_OOP.AdditionalTask_Clinic.doctors.Doctor;

public interface Select {
    public  void selectDoctor();
    public void selectDoctor(Doctor... doctors);
}
