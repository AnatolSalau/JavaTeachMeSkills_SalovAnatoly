package HW_6_ClassConstructor.MainTask_1;

public class CreditCard {
    private int numberOfAccount;
    private double currentSum;

    public CreditCard(int numberOfAccount) {
        this.numberOfAccount = numberOfAccount;
        this.currentSum = 0;
    }

    public double addMoney (double value) {
        if ((Double)value instanceof Double) {
            this.currentSum +=value;
            return value;
        }
        else {
            return 0;
        }
    }

    public double getSomeMoney (int quantityMoney) {
        if (quantityMoney > currentSum) {
            System.out.println("WARNING! Entered quantity bigger than current");
            return 0;
        }
        else {
            currentSum -= quantityMoney;
            return quantityMoney;
        }
    }

    @Override
    public String toString() {
        String result = "Number of account: " + this.numberOfAccount +"\n" +
                        "Current quantity money: " + this.currentSum;
        return result;
    }

    public int getNumberOfAccount() {
        return numberOfAccount;
    }

    public double getCurrentSum() {
        return currentSum;
    }
}
