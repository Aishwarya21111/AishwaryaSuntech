package Suntech.Java8Features;

interface C{
    public static void sayhello(){
        System.out.println("Hello!");
    }
}

public class DemoInterface2Static implements A {
    public void sayhello(){
        System.out.println("hello there ");
    }
    public static void main(String[] args) {
        DemoInterface2Static ds = new DemoInterface2Static();
        // // we cannot access static KW with object we need to use the interface directly
        // ds.sayhello();
        C.sayhello();
        ds.sayhello();
        

        
    }
    
}