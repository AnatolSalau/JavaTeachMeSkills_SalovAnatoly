package HW_7_Interface_AbstractClass.MaintTask_2_DirectorWorker_Accountant;

public class Director extends AbstractEmploye implements Printable {
    public Director(String name) {
        super(name);
    }

    @Override
    public void Print() {
        System.out.println(this.name);
    }
}
