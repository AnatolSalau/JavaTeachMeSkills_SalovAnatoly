package HW_6_ClassConstructor.AdditionalTask_2_ATM;

public class Main {
    public static void main(String[] args) {
/*        2. Создать класс, описывающий банкомат.
        - Набор купюр, находящихся в банкомате, должен задаваться тремя
        свойствами:
        количеством купюр номиналом 20, 50 и 100.
        - Сделать метод для добавления денег в банкомат.
        - Сделать функцию, снимающую деньги, которая принимает сумму денег, а
        возвращает булевое значение - успешность выполнения операции.
        При снятии денег функция должна распечатывать каким количеством
        купюр какого номина ла выдаётся сумма.
        - Создать конструктор с тремя параметрами - количеством купюр каждого
        номинала.*/

        ATM atm = new ATM(20,0,
                          50,0,
                        100,0);
        atm.addMoneyToATM();
        atm.printQuantitymoney();
        atm.printGetMoney();
        atm.printQuantitymoney();

    }
}
