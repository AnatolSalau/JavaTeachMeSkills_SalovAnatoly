package HW_7_Interface_AbstractClass.AdditionalTask_SystemDocuments;

import java.util.Date;

public class ContractFotTransporting extends Document implements Printing {
    private String typeProduct;
    private int quantityProducts;
    public ContractFotTransporting() {
        super();
        this.typeProduct = null;
        this.quantityProducts = 0;
    }

    public ContractFotTransporting(int number,String typeProduct, int quantityProducts) {
        super(number);
        this.typeProduct = typeProduct;
        this.quantityProducts = quantityProducts;
    }

    @Override
    public void printInformation() {
        System.out.println();
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "ContractFotTransporting{" +
                "typeProduct='" + typeProduct + '\'' +
                ", quantityProducts=" + quantityProducts +
                ", number=" + number +
                ", dateDocuments=" + dateDocuments +
                '}';
    }
}
