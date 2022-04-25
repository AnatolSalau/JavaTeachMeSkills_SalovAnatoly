package HW_7_Interface_AbstractClass.AdditionalTask_SystemDocuments;

public class Main {
 /*   Дополнительное задание
3. Создать систему для учета документов.
    Создать класс Регистр, который будет иметь методы:
        - сохранения документа в регистре
        - предоставление информации о документе
    Система может работать с тремя типами документов:
1) Контракт на поставку товаров
    Содержит поля:
        - Номер документа
        - Тип товаров
        - Количество товаров
        - Дата документа
2) Контракт с сотрудником
    Содержит поля:
        - Номер документа
        - Дата документа
        - Дата окончания контракта
        - Имя сотрудника
3) Финансовая накладная
    Содержит поля:
        - Итоговая сумма за месяц
        - Дата документа
        - Номер документа
        - Код департамента
- Класс регистр должен содержать внутри себя массив и при добавлении
    документа в регистр этот добавляемый документ должен добавляться в
            массив;
- Массив для класса регистра должен быть размером 10;
- Для полей "Дата документа" следует использовать тип данных Date;
- В методе предоставления информации о документе следует выводить
    на экран информацию о переданном входным параметром документе;
- Каждый класс для описания документов должен содержать конструктор
    с параметрами и без;
- Для имитации работы системы создайте класс Main, который будет
    содержать только один метод public static void main

    В этом методе напишите код для создания каждого из типов
    документов, добавления их в регистр и вывода информации о документе;
- Все классы разместить по пакетам;
- При выполнении задания использовать понятия интерфейсов и
    абстрактных классов.*/



    public static void main(String[] args) {
        Registr registrOne = new Registr();

        ContractFotTransporting contractFotTransporting = new ContractFotTransporting(01,"Milk",10);
//        1650974400000 - 26.04.2022 15:00
        ContractForEmploye contractForEmploye = new ContractForEmploye(02,1650974412000L,"Anatoly");
        FinancialInvoice financialInvoice = new FinancialInvoice(02,113.25,123456);

        System.out.println("\n  DateCreateDocuments: " + contractForEmploye.getDateDocuments());
        System.out.println("  DateEndDocuments: " + contractForEmploye.getDateEnd() +"\n");

        registrOne.addToRegistr(contractFotTransporting);
        registrOne.addToRegistr(contractForEmploye);
        registrOne.addToRegistr(financialInvoice);

        registrOne.printTopRegistr();

        registrOne.printInformationDocument(0);
        registrOne.printInformationDocument(1);
        registrOne.printInformationDocument(2);
    }


}
