package HW_6_ClassConstructor.AdditionalTask_1_Computer;

public class Computer {
    private double cost;
    private String model;
    private RAM ram;
    private HDD hdd;

    public Computer(double cost, String model) {
        this.cost = cost;
        this.model = model;
        this.hdd = new HDD();
        this.ram = new RAM();
    }

    public Computer(double cost, String model,String nameRam, String nameHdd,
                    int volumeRam, int volumeHdd, HDDType hddType) {
        this.cost = cost;
        this.model = model;
        this.ram = new RAM(nameRam,volumeRam);
        this.hdd = new HDD(nameHdd,volumeHdd,hddType);
    }

    @Override
    public String toString() {
        String result = "\nComputer{\n" +
                "cost=" + cost +
                ", model='" + model + '\'' + ",\n" +
                "ram=" + ram +
                "hdd=" + hdd +"\n" +
                '}';
        System.out.print(result);
        return result;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }
}
