package HW_7_Interface_AbstractClass.AdditionalTask_SystemDocuments;

import java.util.Arrays;

public class Registr {
    private Printing[] registrArr;
    private int topRegistr;

    public Registr() {
        registrArr = new Printing[10];
        topRegistr = 0;
    }

    public void addToRegistr (Printing document) {
        if (topRegistr == registrArr.length) {
            System.out.println("Registr is full! Can't add document");
        }
        else {
                registrArr[topRegistr] = document;
                topRegistr ++;
        }
    }

    public void printTopRegistr() {
        System.out.printf("\nRegistr entered %d objects", this.topRegistr);
    }

    public void printInformationDocument (int indexDocument) {
        if (this.registrArr[indexDocument] == null) {
            System.out.printf("\nPosition %d is null\n", indexDocument);
        }
        else {
            this.registrArr[indexDocument].printInformation();
        }
    }
}
