package HW_6_ClassConstructor.MainTask_1;

public class Main {
    public static void main(String[] args) {
/*        1. Создать класс CreditCard c полями номер счета, текущая сумма на счету.
                Добавьте метод, который позволяет начислять сумму на кредитную
        карточку.
                Добавьте метод, который позволяет снимать с карточки некоторую сумму.
        Добавьте метод, который выводит текущую информацию о карточке.
                Напишите программу, которая создает три объекта класса CreditCard у
        которых заданы номер счета и начальная сумма
        Тестовый сценарий для проверки:
        Положите деньги на первые две карточки и снимите с третьей.
        Выведите на экран текущее состояние всех трех карточек.*/
        CreditCard creditCardOne = new CreditCard(0001111);
        CreditCard creditCardTwo = new CreditCard(0002222);
        CreditCard creditCardThree = new CreditCard(0003333);
        System.out.printf("Add money to card with number %d: %f\n",creditCardOne.getNumberOfAccount(),creditCardOne.addMoney(150));
        System.out.printf("Get money from card with number %d: %f\n",creditCardOne.getNumberOfAccount(),creditCardOne.getSomeMoney(50));

        System.out.printf("Add money to card with number %d: %f\n",creditCardTwo.getNumberOfAccount(),creditCardTwo.addMoney(150));

        System.out.printf("Add money to card with number %d: %f\n",creditCardThree.getNumberOfAccount(),creditCardThree.getSomeMoney(200));

        System.out.println(creditCardOne.toString());
        System.out.println(creditCardTwo.toString());
        System.out.println(creditCardThree.toString());
    }
}
