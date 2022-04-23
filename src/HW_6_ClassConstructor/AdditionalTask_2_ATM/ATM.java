package HW_6_ClassConstructor.AdditionalTask_2_ATM;

import java.util.Scanner;

public class ATM {
    private Banknote nominal20;
    private Banknote nominal50;
    private Banknote nominal100;
    private Scanner scanner = new Scanner(System.in);

    public ATM (int nominalOne, int quantityOne,
                int nominalTwo, int quantityTwo,
                int nominalThree, int quantityThree) {
        this.nominal20 = new Banknote(nominalOne,quantityOne);
        this.nominal50 = new Banknote(nominalTwo,quantityTwo);
        this.nominal100 = new Banknote(nominalThree,quantityThree);
    }

    public void addMoneyToATM () {
        System.out.println("\nYou can add money to ATM");
        System.out.printf("\nPlease, enter quantity of first nominal (%d) :",nominal20.getNominal());
        nominal20.addQuantityBanknotes(scanner.nextInt());

        System.out.printf("\nPlease, enter quantity of first nominal (%d) :",nominal50.getNominal());
        nominal50.addQuantityBanknotes(scanner.nextInt());

        System.out.printf("\nPlease, enter quantity of first nominal (%d) :",nominal100.getNominal());
        nominal100.addQuantityBanknotes(scanner.nextInt());
    }

    public void printQuantitymoney() {
        System.out.println("\nATM have:");
        nominal20.printQuantity();
        nominal50.printQuantity();
        nominal100.printQuantity();
    }

    public boolean printGetMoney() {
        System.out.print("\nEnter quantity money, that  would like to get (multiple: 20, 50, 100): ");
        int money = scanner.nextInt();
        if (checkEnteredQuantityOfMoney(money)) {
            return getMoney(money);
        }
        else {
            System.out.print("printGetMoney Error! ");
            return false;
        }
    }

    private boolean checkEnteredQuantityOfMoney(int money) {
        int allMOney = nominal20.calculateTotalAmount() +
                nominal50.calculateTotalAmount() +
                nominal100.calculateTotalAmount();
        if (money > allMOney) {
            System.out.println("ERROR! Entered money bigger than money on bank account");
            return false;
        }
        else if(money <=0) {
            System.out.println("ERROR! Entered money zero or negative");
            return false;
        }
        else {
                if(money % nominal20.getNominal() == 0 ||
                money % nominal50.getNominal() == 0 ||
                money % nominal50.getNominal() == 0) {
                return true;
                }
                else {
                    System.out.println("ERROR! Entered summ not multiple: 20, 50, 100");
                    return false;
                }
        }
    }

    private boolean getMoney(int money) {
        int quantityBanknotes = 0;
        if(money <= nominal100.calculateTotalAmount() && money % nominal100.getNominal() == 0) {
            nominal100.minusQuantityBanknotes(money/nominal100.getNominal());
            return true;
        }
        else if (money <=nominal50.calculateTotalAmount() && money % nominal50.getNominal() == 0) {
            nominal50.minusQuantityBanknotes(money/nominal50.getNominal());
            return true;
        }
        else if (money <= nominal20.calculateTotalAmount() && money % nominal20.getNominal() == 0) {
            nominal20.minusQuantityBanknotes(money/nominal20.getNominal());
            return true;
        }
        else {
            System.out.println("getMoney Error!");
            return false;
        }

    }



}
