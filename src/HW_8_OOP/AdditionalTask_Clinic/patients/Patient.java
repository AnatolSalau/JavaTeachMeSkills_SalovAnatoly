package HW_8_OOP.AdditionalTask_Clinic.patients;

import HW_8_OOP.AdditionalTask_Clinic.doctors.*;

public  class Patient implements Select{

    Cure currentDoctor;
    PlaneCure currentPlaneCure;

    public Patient(CodeCure codeCure) {
        this.currentDoctor = null;
        this.currentPlaneCure = new PlaneCure(codeCure);
    }

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
        System.out.println("Method: selectDoctor");
        this.currentDoctor.curePatient();

    }

    // set for patient first free doctor
    @Override
    public void selectDoctor(Doctor... doctors) {
        for (Doctor doctor : doctors) {
            switch (doctor.condition) {
                case FREE :{
                    this.currentDoctor =  doctor;
                    break;
                }
                default:continue;
            }
            break;
        }
        System.out.println("Method: selectDoctor (first free doctor from array of doctors)");
        this.currentDoctor.curePatient();
    }

    public void setCurrentPlaneCure(PlaneCure currentPlaneCure) {
        this.currentPlaneCure = currentPlaneCure;
    }

    public void printToString() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "\nPatient{" +
                "currentDoctor=" + currentDoctor +
                ", currentPlaneCure=" + currentPlaneCure +
                "}\n";
    }

    public Cure getCurrentDoctor() {
        return currentDoctor;
    }
}
