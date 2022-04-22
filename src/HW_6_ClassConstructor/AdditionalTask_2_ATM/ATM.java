package HW_6_ClassConstructor.AdditionalTask_2_ATM;

import java.util.Scanner;

public class ATM {
    private Banknote nominaOne;
    private Banknote nominaTwo;
    private Banknote nominalThree;

    public ATM (int nominalOne, int quantityOne,
                int nominalTwo, int quantityTwo,
                int nominalThree, int quantityThree) {
        this.nominaOne = new Banknote(nominalOne,quantityOne);
        this.nominaTwo = new Banknote(nominalTwo,quantityTwo);
        this.nominalThree = new Banknote(nominalThree,quantityThree);
    }

    public void addMoneyToATM () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You can add money to ATM");
        System.out.printf("\nPlease, enter quantity of first nominal (%d) :",nominaOne.getNominal());
        nominaOne.addQuantity(scanner.nextInt());

        System.out.printf("\nPlease, enter quantity of first nominal (%d) :",nominaTwo.getNominal());
        nominaTwo.addQuantity(scanner.nextInt());

        System.out.printf("\nPlease, enter quantity of first nominal (%d) :",nominalThree.getNominal());
        nominalThree.addQuantity(scanner.nextInt());
    }

    public boolean getMoney (int removedMoney) {
        if (checkEnteredQuantityOfMoney(removedMoney)) {
                if (nominaOne.getQuantity() > 0 && nominaOne.getQuantity() < removedMoney) {
                    nominaOne.minusQuantity(removedMoney);
                    return true;
                }
                else if (nominaTwo.getQuantity() > 0 && nominaTwo.getQuantity() < removedMoney) {
                    nominaTwo.minusQuantity(removedMoney);
                    return true;
                }
                else if(nominalThree.getQuantity() > 0 && nominalThree.getQuantity() < removedMoney) {
                    nominalThree.minusQuantity(removedMoney);
                    return true;
                }
                else {
                    System.out.println("ERROR!");
                    return false;
                }
            }
        else {
            return false;
        }

    }

    private boolean checkEnteredQuantityOfMoney(int money) {
        int allMOney = nominaOne.getQuantity()* nominaOne.getNominal() +
                        nominaTwo.getQuantity()* nominaTwo.getNominal() +
                        nominalThree.getQuantity()* nominalThree.getNominal();
        if (money > allMOney) {
            System.out.println("ERROR! Entered money bigger than money on bank account");
            return false;
        }
        else if(money <=0) {
            System.out.println("ERROR! Entered money zero or negative");
            return false;
        }
        else {
            return true;
        }
    }



}
