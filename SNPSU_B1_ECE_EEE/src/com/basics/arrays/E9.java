package com.basics.arrays;
class Equipment {
    String name;
    int equipmentId;
    String lab;
    double voltage;
    boolean isWorking;

    public Equipment(String name, int equipmentId, String lab, double voltage, boolean isWorking) {
        this.name = name;
        this.equipmentId = equipmentId;
        this.lab = lab;
        this.voltage = voltage;
        this.isWorking = isWorking;
    }
}
public class E9 {
    public static void main(String[] args) {
        Equipment[] equipments = new Equipment[]{
                new Equipment("Oscilloscope", 201,
                        "Analog Lab", 220, true),
                new Equipment("Power Supply", 202,
                        "VLSI Lab", 230, false),
                new Equipment("Signal analyzer", 203,
                        "DSP Lab", 220, true)
        };

        for (Equipment equipment : equipments){
            System.out.println(equipment.name + ", "
                    + equipment.equipmentId + ", "
                    + equipment.lab + ", "
                    + equipment.voltage + ", "
                    + equipment.isWorking);
        }
    }
}
