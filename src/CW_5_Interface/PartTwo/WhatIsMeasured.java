package CW_5_Interface.PartTwo;

public enum WhatIsMeasured {
    CELSIUS("degree of celsius"),
    KELVIN("degree of kelvin");

    private String pointsMeasures;

    WhatIsMeasured(String pointsMeasures) {
        this.pointsMeasures = pointsMeasures;
    }

    public String getPointsMeasures() {
        return pointsMeasures;
    }
}
