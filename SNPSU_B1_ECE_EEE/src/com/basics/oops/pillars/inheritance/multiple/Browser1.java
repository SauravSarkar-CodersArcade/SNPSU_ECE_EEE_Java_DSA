package com.basics.oops.pillars.inheritance.multiple;
public interface Browser1 {
    void browser1();
}
interface Browser2{
    void browser2();
}
interface Browser3{
    void browser3();
}
class Browsers implements Browser1, Browser2, Browser3{
    @Override
    public void browser1() {
        System.out.println("Google Chrome");
    }
    @Override
    public void browser2() {
        System.out.println("Mozilla Firefox");
    }
    @Override
    public void browser3() {
        System.out.println("Safari Browser");
    }
    public static void main(String[] args) {
        Browsers browser = new Browsers();
        browser.browser1();
        browser.browser2();
        browser.browser3();
    }
}
