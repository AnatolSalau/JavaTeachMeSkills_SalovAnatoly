package HW_8_OOP.AdditionalTask_Clinic.patients;

import HW_8_OOP.AdditionalTask_Clinic.doctors.*;

public abstract class AbstractPatient implements Select{

    Doctor currentDoctor;
    PlaneCure currentPlaneCure;

    @Override
    public void selectDoctor() {
            switch (this.currentPlaneCure.codeCure){
                case ONE: {
                    this.currentDoctor = new Surgeon();
                    break;
                }
                case TWO: {
                    this.currentDoctor = new Dentist();
                    break;
                }
                default: {
                    this.currentDoctor = new Therapist();
                }
            }
    }

    // set for patient first free doctor
    @Override
    public void selectDoctor(Doctor... doctors) {
        for (Doctor doctor : doctors) {
            switch (doctor.condition) {
                case FREE -> this.currentDoctor = doctor;
            }
        }
    }
}
