package HW_6_ClassConstructor.AdditionalTask_2_ATM;

public class Banknote {
    private final int nominal;
    private int quantity;

    public Banknote(final int nominal) {
        this.nominal = nominal;
        this.quantity = 0;
    }
    public Banknote(final int nominal, int quantity) {
        this.nominal = nominal;
        this.quantity = quantity;
    }

    public int getNominal() {
        return nominal;
    }

    public int getQuantity() {
        return quantity;
    }
    public void addQuantity(int quantity) {
        System.out.printf("You added %d banknots mominal %d\n",quantity,nominal);
        this.quantity += quantity;
    }

    public void minusQuantity(int quantity) {
        System.out.printf("Your reduced %d banknots nominal of %d \n",quantity,nominal);
        this.quantity -= quantity;
        System.out.printf("The remaining amount of money: %d", quantity);
    }
}
