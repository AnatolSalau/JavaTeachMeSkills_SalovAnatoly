package HW_7_Interface_AbstractClass.AdditionalTask_SystemDocuments;

import java.util.Date;

public class ContractForEmploye extends Document implements Printing {
    private Date dateEnd;
    private String name;

    public ContractForEmploye() {
        super();
        this.dateEnd = this.dateDocuments;
        this.name = null;
    }

    public ContractForEmploye(int number, long dateEnd, String name) {
        super(number);
        this.dateEnd = new Date(dateEnd);
        this.name = name;
    }

    @Override
    public void printInformation() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "ContractForEmploye{" +
                "dateEnd=" + dateEnd +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", dateDocuments=" + dateDocuments +
                '}';
    }

    public Date getDateEnd() {
        return dateEnd;
    }
}
