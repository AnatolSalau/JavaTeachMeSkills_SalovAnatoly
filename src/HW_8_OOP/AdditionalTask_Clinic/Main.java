package HW_8_OOP.AdditionalTask_Clinic;

import HW_8_OOP.AdditionalTask_Clinic.doctors.Condition;
import HW_8_OOP.AdditionalTask_Clinic.doctors.Dentist;
import HW_8_OOP.AdditionalTask_Clinic.doctors.Surgeon;
import HW_8_OOP.AdditionalTask_Clinic.doctors.Therapist;
import HW_8_OOP.AdditionalTask_Clinic.patients.CodeCure;
import HW_8_OOP.AdditionalTask_Clinic.patients.Patient;
import HW_8_OOP.AdditionalTask_Clinic.patients.PlaneCure;

public class Main {
    public static void main(String[] args) {
/*        Дополнительное задание
        2. Создать программу для имитации работы клиники.
                Пусть в клинике будет три врача: хирург, терапевт и дантист.
        Каждый врач имеет метод «лечить», но каждый врач лечит по-своему.
                Так же предусмотреть класс «Пациент» и класс «План лечения».
        Создать объект класса «Пациент» и добавить пациенту план лечения.
                Так же создать метод, который будет назначать врача пациенту согласно
        плану лечения.
        Если план лечения имеет код 1 – назначить хирурга и выполнить метод
        лечить.
        Если план лечения имеет код 2 – назначить дантиста и выполнить метод
        лечить.
        Если план лечения имеет любой другой код – назначить терапевта и
        выполнить метод лечить.*/

        Dentist dentistBusy = new Dentist();
        Dentist dentistFree = new Dentist(Condition.FREE);

        Surgeon surgeonBusy = new Surgeon();
        Surgeon surgeonFree = new Surgeon(Condition.FREE);

        Therapist therapistBusy = new Therapist();
        Therapist therapistFree = new Therapist(Condition.FREE);

        Patient patientDoctorisNull = new Patient(CodeCure.ONE);
        System.out.println(patientDoctorisNull.getCurrentDoctor());

       patientDoctorisNull.selectDoctor();
       System.out.println(patientDoctorisNull.getCurrentDoctor());

        // set for patient first free doctor
       patientDoctorisNull.selectDoctor(dentistBusy,surgeonBusy, dentistFree);



    }
}
