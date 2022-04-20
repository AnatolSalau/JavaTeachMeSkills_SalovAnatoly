package CW_5_Interface.PartTwo;

public class KelvinConverter implements Converter{
    @Override
    public int convertTo(int temperature) {
        int result = temperature/100;
        String degree = WhatIsMeasured.CELSIUS.getPointsMeasures();
        System.out.printf("Kelvin convert = %d %s",result, degree);
        return result;
    }
}
