package HW_7_Interface_AbstractClass.MaintTask_2_DirectorWorker_Accountant;

public class Main {
    public static void main(String[] args) {
/*        2. Создать классы "Директор", "Рабочий", "Бухгалтер".
        Реализовать интерфейс с методом, который печатает название
        должности и имплементировать этот метод в созданные классы.*/
        Accountant accountant = new Accountant("Accountant");
        Director director = new Director("Director");
        Worker worker = new Worker("Worker");

        print(accountant,director,worker);
    }

    public static void print(Printable... printable) {
        for (Printable printableEach : printable) {
            printableEach.Print();
        }
    }
}
