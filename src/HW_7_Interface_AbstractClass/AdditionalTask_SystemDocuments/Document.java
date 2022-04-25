package HW_7_Interface_AbstractClass.AdditionalTask_SystemDocuments;

import java.util.Date;

public class Document {
    protected int number;
    protected Date dateDocuments;

    public Document() {
        this.number =  1111_1111;
        this.dateDocuments = new Date();
    }

    public Document(int number) {
        this.number = number;
        this.dateDocuments = new Date();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDateDocuments() {
        return dateDocuments;
    }

    public void setDateDocuments(Date dateDocuments) {
        this.dateDocuments = dateDocuments;
    }
}
