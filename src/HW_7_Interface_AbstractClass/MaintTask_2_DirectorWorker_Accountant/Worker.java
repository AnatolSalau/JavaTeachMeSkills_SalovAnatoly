package HW_7_Interface_AbstractClass.MaintTask_2_DirectorWorker_Accountant;

public class Worker extends AbstractEmploye implements Printable {
    public Worker(String name) {
        super(name);
    }

    @Override
    public void Print() {
        System.out.println(this.name);
    }
}
