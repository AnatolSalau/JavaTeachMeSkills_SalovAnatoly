package HW_8_OOP.AdditionalTask_Clinic.patients;

public  class PlaneCure {
    CodeCure codeCure;

    public PlaneCure(CodeCure codeCure) {
        this.codeCure = codeCure;
    }

    @Override
    public String toString() {
        return "\nPlaneCure{" +
                "codeCure=" + codeCure +
                "}\n";
    }
}
