package Suntech.Java8Features;
interface A{
    default void sayhello(){
        System.out.println("hi how are you");
    }
}
interface B{
    default void sayhello(){
        System.out.println("Say hello to b");
    }
}

public class DemoInterface2Default implements A, B {
    public static void main(String[] args) {
        DemoInterface2Default df = new DemoInterface2Default(); 
        df.sayhello();
    }
   
    //ambiguity as same method is inherited twice and are different
    // df.sayhello();
    //overide it in your own method
    public void sayhello(){
        A.super.sayhello();
    }
   

    
}
