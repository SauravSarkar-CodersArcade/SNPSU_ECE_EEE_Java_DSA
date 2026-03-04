package com.basics.garbageCollection;
public class Test {
    @Deprecated
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object destroyed!");
    }
    public static void main(String[] args) {
        Test t = new Test();
        t = null;
        for (int i=1; i<100; i++){
            System.gc();
        }
    }
}
// Now-a-days all clutter is auto-cleared after execution by JVM
