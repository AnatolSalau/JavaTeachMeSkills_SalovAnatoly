package CW_8_OOP.taskTwo.common;

import CW_8_OOP.taskTwo.profession.Driver;

public class Person extends Driver {
    private String firstLastName;

    public Person(int experience, String firstLastName) {
        super(experience);
        this.firstLastName = firstLastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstLastName='" + firstLastName + '\'' +
                ", experience=" + experience +
                '}';
    }

    @Override
    public int getExperience() {
        return super.getExperience();
    }

    @Override
    public void setExperience(int experience) {
        super.setExperience(experience);
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }
}
