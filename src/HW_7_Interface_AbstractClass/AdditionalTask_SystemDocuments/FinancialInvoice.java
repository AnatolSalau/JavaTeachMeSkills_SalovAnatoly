package HW_7_Interface_AbstractClass.AdditionalTask_SystemDocuments;

public class FinancialInvoice extends Document implements Printing {
    private double finalSum;
    private int codeDepartament;

    public FinancialInvoice() {
        super();
    }

    public FinancialInvoice(int number, double finalSum, int codeDepartament) {
        super(number);
        this.finalSum = finalSum;
        this.codeDepartament = codeDepartament;
    }

    @Override
    public void printInformation() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "FinancialInvoice{" +
                "number=" + number +
                ", dateDocuments=" + dateDocuments +
                ", finalSum=" + finalSum +
                ", codeDepartament=" + codeDepartament +
                '}';
    }
}
