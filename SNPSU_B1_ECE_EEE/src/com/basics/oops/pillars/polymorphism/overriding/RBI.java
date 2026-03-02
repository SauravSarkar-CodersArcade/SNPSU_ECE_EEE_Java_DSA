package com.basics.oops.pillars.polymorphism.overriding;
public class RBI {
    double rateOfInterest(){
        return 6.8;
    }
}
class HDFC extends RBI{
    @Override
    double rateOfInterest(){
        return 7.2;
    }
}
class ICICI extends RBI{
    @Override
    double rateOfInterest(){
        return 7.5;
    }
}
class Canara extends RBI{
    @Override
    double rateOfInterest(){
        return 7.9;
    }
    public static void main(String[] args) {
        // Upcasting -> Parent obj = new Child();
        RBI rbi = new RBI();
        RBI hdfc = new HDFC();
        RBI icici = new ICICI();
        RBI canara = new Canara();
        System.out.println("The ROI of RBI is: " + rbi.rateOfInterest() + "%");
        System.out.println("The ROI of ICICI is: " + icici.rateOfInterest() + "%");
        System.out.println("The ROI of HDFC is: " + hdfc.rateOfInterest() + "%");
        System.out.println("The ROI of CANARA is: " + canara.rateOfInterest() +  "%");
    }
}
