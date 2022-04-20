package CW_5_Interface;

public abstract class Figure {
    private int lengthOne,
            lengthTwo,
            lengthThree;

    public Figure(int lengthOne, int lengthTwo, int lengthThree) {
        this.lengthOne = lengthOne;
        this.lengthTwo = lengthTwo;
        this.lengthThree = lengthThree;
    }

    public int perimeter () {
        return lengthThree+lengthTwo+lengthOne;
    }

    public int getLengthOne() {
        return lengthOne;
    }

    public void setLengthOne(int lengthOne) {
        this.lengthOne = lengthOne;
    }

    public int getLengthTwo() {
        return lengthTwo;
    }

    public void setLengthTwo(int lengthTwo) {
        this.lengthTwo = lengthTwo;
    }

    public int getLengthThree() {
        return lengthThree;
    }

    public void setLengthThree(int lengthThree) {
        this.lengthThree = lengthThree;
    }
}
