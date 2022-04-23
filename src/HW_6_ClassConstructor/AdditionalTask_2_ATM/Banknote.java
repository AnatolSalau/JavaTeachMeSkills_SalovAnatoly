package HW_6_ClassConstructor.AdditionalTask_2_ATM;

public class Banknote {
    private int nominal;
    private int quantityBanknote;

    public Banknote() {
        this.nominal = 0;
        this.quantityBanknote = 0;
    }

    public Banknote(int nominal) {
        this.nominal = nominal;
        this.quantityBanknote = 0;
    }
    public Banknote(int nominal, int quantity) {
        this.nominal = nominal;
        this.quantityBanknote = quantity;
    }

    public void addQuantityBanknotes(int quantity) {
        System.out.printf("You added %d banknots mominal of %d\n",quantity, nominal);
        this.quantityBanknote += quantity;
    }

    public void minusQuantityBanknotes(int quantity) {
        System.out.printf("Your get %d banknots, nominal of %d \n",quantity, nominal);
        this.quantityBanknote -= quantity;
    }

    public int calculateTotalAmount() {
        int result = this.nominal*this.quantityBanknote;
        return result;
    }

    public void printQuantity() {
        System.out.printf("nominal(%d) - %d banknotes\n", this.nominal,this.quantityBanknote);
        System.out.printf("total sum this banknotes - %d \n", calculateTotalAmount());
    }

    public int getNominal() {
        return nominal;
    }

    public int getQuantityBanknote() {
        return quantityBanknote;
    }

}
