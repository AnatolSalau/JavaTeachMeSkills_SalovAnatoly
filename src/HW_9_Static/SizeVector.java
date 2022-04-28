package HW_9_Static;

public enum SizeVector {
    TWO_SIZE_VECTOR("Vector for two size CS",2),
    THREE_SIZE_VECTOR("Vector for three size CS",3);

    private String description;
    private int lengthArray;

    SizeVector(String description, int lengthArray) {
        this.description = description;
        this.lengthArray = lengthArray;
    }

    public String getDescription() {
        return description;
    }

    public int getLengthArray() {
        return lengthArray;
    }
}
