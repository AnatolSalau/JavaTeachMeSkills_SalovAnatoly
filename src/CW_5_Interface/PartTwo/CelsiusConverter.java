package CW_5_Interface.PartTwo;

public class CelsiusConverter implements Converter{
    @Override
    public int convertTo(int temperature) {
        int result = temperature*100;
        String degree = WhatIsMeasured.KELVIN.getPointsMeasures();
        System.out.printf("Celsius convert = %d %s",result, degree);
        return result;
    }
}
