package com.basics.oops.pillars.inheritance.multiple;
public interface IceCream1 {
    String iceCream1();
}
interface IceCream2{
    String iceCream2();
}
interface IceCream3{
    String iceCream3();
}
class IceCreams implements IceCream1, IceCream2, IceCream3{

    @Override
    public String iceCream1() {
        return "Vanilla";
    }

    @Override
    public String iceCream2() {
        return "Chocolate";
    }
    @Override
    public String iceCream3(){
        return "Blueberry";
    }
    public static void main(String[] args) {
        IceCreams iceCream = new IceCreams();
        System.out.println("Customer likes: " + iceCream.iceCream1());
        System.out.println("Customer likes: " + iceCream.iceCream2());
        System.out.println("Customer likes: " + iceCream.iceCream3());

    }
}
